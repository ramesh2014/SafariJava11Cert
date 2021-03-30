package deadcode;

public class Ex1 {
  private static final boolean TEST = false;
  public static void main(String[] args) {
    if (TEST) { // if IS PERMITTED to have dead code (conditional compilation)
      System.out.println("Hello");
    }
//    while (false) {
//      System.out.println("Hello");
//    }
  }
}
