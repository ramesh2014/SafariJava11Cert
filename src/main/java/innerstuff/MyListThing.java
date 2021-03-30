package innerstuff;

import java.util.Iterator;

public class MyListThing implements Iterable<String> {
  private String [] data = new String[10];
  private int count = 0;

  public void add(String s) {
    data[count++] = s; // no overflow protection!!!
  }

  public String get(int idx) {
    return data[idx]; // no range protection!!
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("MyListThing[");
    for (int idx = 0; idx < count; idx++) {
      sb.append(data[idx]).append(", ");
    }
    sb.setLength(sb.length() -2);
    sb.append("]");
    return sb.toString();
  }

  private class MyIterator implements Iterator<String> {
    private int progress = 0;

    @Override
    public boolean hasNext() {
      return progress < count;
    }

    @Override
    public String next() {
      return data[progress++]; // still no protection!
    }
  }
  public Iterator<String> iterator() {
    return new MyIterator();
  }

  public static void main(String[] args) {
    MyListThing mlt = new MyListThing();
    mlt.add("Fred");
    mlt.add("Jim");
    mlt.add("Sheila");

    // it should print itself
    System.out.println("mlt is " + mlt);

    // it's iterable
    for (String s : mlt) {
      System.out.println("> " + s);
    }

    // it should provide an iterator that has hasNext and next
    Iterator<String> is = mlt.iterator();
    while (is.hasNext()) {
      System.out.println(">> " + is.next());
    }

    // two independent iterators should keep independent track of progress
    Iterator<String> is1 = mlt.iterator();
    Iterator<String> is2 = mlt.iterator();

    System.out.println("is1 gives " + is1.next());
    System.out.println("is2 gives ----------------------- " + is2.next());
    System.out.println("is1 gives " + is1.next());
    System.out.println("is1 gives " + is1.next());
    System.out.println("is2 gives ----------------------- " + is2.next());
    System.out.println("is2 gives ----------------------- " + is2.next());

    // Note, every instance of the inner class MyIterator is "attached"
    // to an instance of a MyListThing, yet, it has additional state that
    // is unique to it, so it keeps track of progress independently
    // Because it is "inside" the definition of MyListThing, the MyIterator
    // *also* has privileged access to the private members of the MyListThing

  }
}
