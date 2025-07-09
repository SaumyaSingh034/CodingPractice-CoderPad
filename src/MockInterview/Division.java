package MockInterview;

public class Division {
    public static void main(String[] args){
        int divd = 12;
        int divs = 2;
        divideWithoutOperator(divd, divs);
    }

    private static void divideWithoutOperator(int divd, int divs) {
        if(divs == 0)
            throw new IllegalArgumentException("Divisor is zero, Divison is not possible");
        int quot = 0;
        while(divd >= divs){
            divd -= divs;
            quot++;
        }
        System.out.println(quot);
    }
}
