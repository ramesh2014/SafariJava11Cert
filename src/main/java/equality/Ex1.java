package equality;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {
//    String s = "Hello";
////    String t = "Hello";
////    String t = "He" + "llo";
//    String t = "He";
//    t += "llo"; // NOT a constant expression
////    t = t.intern();
//    System.out.println(s == t);

//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    System.out.println(s.equals(t));

//    StringBuilder s = new StringBuilder("Hello");
//    StringBuilder t = new StringBuilder("He");
//    t.append("llo");
//    System.out.println("s = " + s + " and t = " + t);
//    System.out.println(s.equals(t)); // not overriden because SB is MUTABLE
//
//    List<String> ls = List.of("Fred", "Jim");
//    List<String> ls2 = new ArrayList<>(ls);
//    System.out.println(ls.equals(ls2));
//
    LocalDate ld = LocalDate.of(2021, 3, 29);
    LocalDate ld2 = LocalDate.of(2021, 3, 29);
    System.out.println(ld.equals(ld2));
    System.out.println(ld == ld2);
  }
}
