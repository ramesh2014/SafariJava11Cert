package lambdas;

import java.util.function.Predicate;

public class Ex1 {
  // nulls here are the three "Assignment" contexts.
  Predicate<String> ps = null;
  static void doStuff(Predicate<String> ps) {}
  static Predicate<String> getOne() {
    return null;
  }

  public static void main(String[] args) {
    doStuff(null);

    // cast also lets us write a lambda directly
    ((Predicate<String>)null).test("xx");
  }
}
