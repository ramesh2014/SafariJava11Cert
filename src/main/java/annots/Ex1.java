package annots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

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
@interface Annot {}

//@Annot(text = "Hello")
//@Annot(text = {"Fred", "Jim"})
//@Annot(text = "Fred") // even for arrays, with only one element!
@Annot
public class Ex1 {
//  @Annot(value = "banana") String s;
//  @Annot("banana") String s;
  @Annot String s;
  @Annot void doStuff(){};
}
