package resolution;

import java.time.LocalDate;
import java.util.List;

public class OverloadMethods {
  // Overloaded methods MUST DIFFER IN ARGUMENT TYPE SEQUENCE
  // Identity of a method is name and argumetn type sequence
  // doStuff_Void
  static void doStuff() {
    System.out.println("doStuff()");
  }
//  int doStuff() { return 1; }
  // Overloaded methods ARE INDEPENDENT METHODS
  // doStuff_Int
  static int doStuff(int x) {
    System.out.println("doStuff(int)");
    return x;
  }
  // signature is doStuff_List ... Generic types are "erased" by runtime
//  void doStuff(List<String> ls) {}
//  void doStuff(List<LocalDate> ls) {}
  static int doStuff(Integer x) {
    System.out.println("doStuff(Integer)");
    return x;
  }
  static int doStuff(Integer x, Integer y) {
    System.out.println("doStuff(Integer, Integer)");
    return x;
  }

  static int doStuff(int ... x) {
    System.out.println("doStuff(int ...)");
    return 0;
  }

//  static int doStuff(int x, long y) {
//    System.out.println("doStuff(int, long)");
//    return x;
//  }

//  static int doStuff(long x, int y) {
//    System.out.println("doStuff(long, int)");
//    return 1;
//  }

  public static void main(String[] args) {
    // Resolution starts with "simple" methods
    // i.e. autoboxing and varargs are NOT CONSIDERED
    // if ambiguity is found: ERROR!!!
    // if none, then proceed similarly through:
    // FIRST: autoboxing
    // FINALLY: varargs
    doStuff(1, 1);
  }
}
