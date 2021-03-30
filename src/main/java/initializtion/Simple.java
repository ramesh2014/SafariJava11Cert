package initializtion;

class OddBall1 {
  int x = 200;
  void doStuff() {
    System.out.println(x); // this.x!!!!
    int x = 100;
  }
}

public class Simple {
  {
    // illegal forward reference.
//    System.out.println("Block zero a is " + a);
  }
  Simple() {
    // super() and instance initialization
    System.out.println("Cons 1");
    System.out.println("a is " + a + " b is " + b);
  }
  int a;
  int b = 100;
  static { System.out.println("Block 1"); }
  {
    System.out.println("Block 2 a is " + a + " b is " + b);
    b = 200;
  }
  static int x = 99;
  static { System.out.println("Block 3, x is " + x); }
  { System.out.println("Block 4 b is " + b);}

  Simple(int x) {
    a = x;
    System.out.println("Cons2");
    System.out.println("a is " + a + " b is " + b);
  }
  public static void main(String[] args) {
    System.out.println("MAIN");
    new Simple(400);
  }
}

class Weird {
  public static void main(String[] args) {
    Simple s = null;
    Class<?> cl = Simple.class;
  }
}
