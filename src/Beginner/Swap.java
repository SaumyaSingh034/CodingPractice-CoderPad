package Beginner;

public class Swap {
    public static void main(String[] args){
        int a = 8;
        int b = 9;
        swapNumbers(a, b);

    }

    private static void swapNumbers(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" ----- "+b);
    }
}
