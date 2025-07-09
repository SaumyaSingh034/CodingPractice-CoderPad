package CodePardFinal;

public class Dividend {
    public static void main(String[] args){
        int dividend = 20, divisor = 4;
        int quot = 0;
        while(dividend >=divisor){
            dividend -= divisor;
            quot++;
        }
        System.out.println(quot);
    }
}
