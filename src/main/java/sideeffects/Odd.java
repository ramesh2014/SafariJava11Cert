package sideeffects;

public class Odd {
  public static void main(String[] args) {
    int i = 10;
    System.out.println(i++ + --i);
    System.out.println(i);
  }
}
