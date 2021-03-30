package initializtion;

public class Parent {
  //  public Parent(int x) {}
  /*private*/ Parent() {
    System.out.println("Parent()");
  }
}

class Child extends Parent {
  Child() {
    // absent "super(...)" get super() from the compiler
    System.out.println("Child()");
  }

  Child(int x) {
    this();
    System.out.println("In child(int)");
  }

  public static void main(String[] args) {
    new Child(99);
  }
}
