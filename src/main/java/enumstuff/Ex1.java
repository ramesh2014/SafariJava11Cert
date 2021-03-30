package enumstuff;

import java.lang.reflect.Constructor;

enum DayOfWeek {
  // elements are public static final fields
  // semicolon "seems optional" until you add anythign other than
  // the enumerated values.
  MONDAY(3.14), TUESDAY, WEDNESDAY(2.7), THURSDAY, FRIDAY, SATURDAY, SUNDAY;
  double x;

  // Can/may provide overloading constructors, just fine.
  // Constructors MUST BE PRIVATE
  // WILL BE PRIVATE if you say nothing
  DayOfWeek() {
    System.out.println("running constructor!");
    x = Math.random();
  }

  DayOfWeek(double value) {
    System.out.println("running overridden constructor!");
    x = value;
  }

  // name is final, toString is not.
//  @Override
//  public String name() {}
  @Override
  public String toString() {
    return "I'm a day of week " + this.name().toLowerCase();
  }
}

public class Ex1 {
  public static void main(String[] args) throws Throwable {
    System.out.println("Monday is " + DayOfWeek.MONDAY);
    var m = DayOfWeek.valueOf("MONDAY");
    System.out.println(m == DayOfWeek.MONDAY);
    System.out.println(DayOfWeek.MONDAY.name());
    System.out.println(DayOfWeek.MONDAY.toString());
    System.out.println(DayOfWeek.MONDAY.ordinal());
    System.out.println(DayOfWeek.MONDAY.x);

    Constructor<?> [] cons = DayOfWeek.class.getDeclaredConstructors();
    for (Constructor c : cons) {
      System.out.println(c);
    }
  }
}
