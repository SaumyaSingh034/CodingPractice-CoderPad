package Practice1;

public class Division
{
    public static void main(String[] args){
        int dividend = 20;
        int divisor = 3;
        int quotient = divide123(dividend, divisor);
        System.out.println(quotient);
    }

    private static int divide123(int dividend, int divisor) {
        if(divisor == 0)
            throw new IllegalArgumentException("Divisor cannot be zero");
        boolean negative = false;
        if(dividend < 0){
            negative = !negative;
            dividend = -dividend;
        }
        if(divisor < 0){
            negative = !negative;
            divisor = -divisor;
        }
        int quotient = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }
        return negative ? -quotient : quotient;

    }
}
