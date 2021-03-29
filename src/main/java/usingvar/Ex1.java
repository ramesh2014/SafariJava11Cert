package usingvar;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//abstract class Odd {
//  abstract <T> T fooVar();
//  {
//    var fooVar = fooVar();
//  }
//}

//class X {
//  var x = 99;
//}
public class Ex1 {
//  void doStuff(var x) { }

//  void doStuff() {
//    var x;
//    x = 100;
//
//  }

//  void doStuff() {
//    var x = 100;
//  }

//  void doStuff() {
////    var x = {1, 2, 3};
////    var x = new int[]{1, 2, 3};
//    int[] x = {1, 2, 3};
//  }

//  static void doOther(Number [] ia) {
//    for (Number x : ia) System.out.println(x);
//  }

//  void doStuff() {
//    var [] x = new int[]{ 1, 2, 3 };
//  }
//  static void doOther(int [] ia) {
//    for (int x : ia) System.out.println(x);
//  }

//  void doStuff() {
//    var x = 99;
//    x = "Hello";
//  }

  public static void main(String[] args) {
    int[] ia = {1, 2, 3};
//    doOther(ia);
//    doOther(new int[]{1, 2, 3});

//    for (var x = 0, y = 2; x < 10; x++) {
//
//    }

    try (var in = new FileReader("");
         var out = new FileWriter("")) {

//    } catch(var ioe) {
    } catch (IOException ioe) {

    }
//    int a = 10, b = 20, c;
//    var a = 10, b = 20, c = 30;
  }
}
