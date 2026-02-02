package Fenruary_2026;

public class DivideWithoutOperator {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        System.out.println(divideWithoutOperator123(a,b));
    }

    private static int divideWithoutOperator123(int a, int b) {
        int count  =0;
        while(a >= b){
            a -= b;
            count++;
        }
        return count;
    }
}
