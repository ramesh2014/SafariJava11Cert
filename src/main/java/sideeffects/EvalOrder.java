package sideeffects;

import java.util.Arrays;

public class EvalOrder {
  public static void main(String[] args) {
    int [] ia1 = {1,2,3};
    int [] ia2 = {-1,-2,-3};
    int [] ia = ia2;
    System.out.println(ia[(ia=ia1)[0]]);
    System.out.println(Arrays.toString(ia));
  }
}
