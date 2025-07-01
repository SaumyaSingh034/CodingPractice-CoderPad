package June;

public class DivideWithoutOperator {
    public static void main(String[] args){
        System.out.println(divide1(10,3));
    }

    private static int divide1(int dividend, int divisor) {
        if(divisor == 0)
            throw new IllegalArgumentException("Divisor is zero");
        boolean negative = false;
        if(dividend < 0){
            negative = !negative;
            dividend = -dividend;
        }
        if(divisor < 0){
            negative = !negative;
            divisor = -divisor;
        }
        int q = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            q++;
        }
        return negative ? -q : q;
    }
}
