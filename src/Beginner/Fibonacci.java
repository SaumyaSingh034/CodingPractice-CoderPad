package Beginner;

public class Fibonacci {
    public static void main(String[] args){
        int number = 5;
        int a = 0;
        int b=1;
        int sum;
        for(int i=0;i<number;i++){
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }
}
