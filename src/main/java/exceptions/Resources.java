package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Resources {
  public static void main(String[] args) throws Throwable {
//    FileReader fr;

    final FileWriter fo = new FileWriter("out.txt");

    try (
        // Generally Declare and initialize a NEW variable for the resource
//        fr = new FileReader("data.txt");
        var fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        // preinitized value "please close"
        fo; // must be final or effectively final ONLY Java 9+
    ) {
//      fr = null; // effectively final
    }
//    fo = null;
    // fo still in scope, but IS CLOSED
  }
}
