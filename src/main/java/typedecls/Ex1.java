package typedecls;

public class Ex1 {
  // fields
  private int x;
  // methods
  void doStuff(Nested nested) {
    System.out.println(this.x);
    System.out.println(Nested.x);
  }
  // inner classes
  // instance of an inner MUST HAVE a reference to an instance of the
  // enclosing outer class
  class Inner1 {}

  // nested classes
  // this might be distract int!! TOP-level class that happens to be declared inside another
  static class Nested {
    private static int x;
    static public void doStuff(Ex1 outer) {
      System.out.println(outer.x);
    }
  }

  void makeOne() {
    new Inner1();
  }

  public static void main(String[] args) {
//    new Inner1();
    new Ex1().new Inner1();
  }

  protected int prot;
}

// method local: only in this invocation of this method :)
// private:  answer "anywhere inside the enclosing
//           TOP LEVEL curly braces surrounding the declaration.
// default: anywhere in the same package
// protected: anywhere in the same package
// AND ALSO in subclasses THROUGH A REFERENCE OF THE SUBCLASS TYPE!
// public:
// IF NOT USING MODULES -- anwhere in the JVM
// USING MODULES
// -- anywhere in the same module
// -- and if "exported public package", then in any other modules that "reads"
//    the declaring module
