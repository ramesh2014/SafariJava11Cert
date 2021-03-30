package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchSeveral {
  public static void main(String[] args) {
    try {
      if (Math.random() > 0.5) throw new FileNotFoundException();
      if (Math.random() > 0.5) throw new IOException();
    } catch (FileNotFoundException fnfe)  {
    } catch (IOException ioe) {
    }
  }
}
