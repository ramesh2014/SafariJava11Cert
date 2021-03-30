package liskov;

class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

class Sub extends Base {
//  @Override
  void doBaseStuff(int x) { System.out.println("doSubStuff"); }
}

public class Excepts {
//  public static void main(String[] args) {
//    Base b = new Sub();
//
//    b.doBaseStuff();
//  }
}
