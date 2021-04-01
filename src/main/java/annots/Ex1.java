package annots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

//@Target({ElementType.FIELD, ElementType.METHOD})
//@interface Annot {}

//@ interface Annot {
////  String value() = "";
////  String value() default "";
//  String value();
//}

//@interface Annot {
////  StringBuilder text(); // unacceptable type!!
//  String [] text(); // types for annotation attributes are restricted
//  // primitive, String, Class, Annotations (apparently only some)
//  // simple arrays of the above
//}

//@interface Annot {
//  Class value();
//}

@Retention(RetentionPolicy.RUNTIME)
@interface Annot {
  String name() default "Fred";
  int value();
}

//@Annot(text = "Hello")
//@Annot(text = {"Fred", "Jim"})
//@Annot(text = "Fred") // even for arrays, with only one element!
@Annot(99)
public class Ex1 {
//  @Annot(value = "banana") String s;
//  @Annot("banana") String s;
  @Annot(value=10, name="Albert") private String s;
  @Annot(1) void doStuff(){};
}

class TryIt {
  public static void main(String[] args) throws Throwable {
    Class<?> cl = Class.forName("annots.Ex1");
    Field[] fields = cl.getDeclaredFields();
    for (Field f : fields) {
      System.out.println("> " + f);
      Annot annot = f.getAnnotation(Annot.class);
      if (annot != null) {
        System.out.println("Annotation found!!! name is "
            + annot.name() + " value is " + annot.value());
      }
    }
  }
}
