package Fenruary_2026;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length+1;
      int expected = n * (n+1)/2;
      int actual = Arrays.stream(arr).sum();
      System.out.println(expected-actual);
    }
}
