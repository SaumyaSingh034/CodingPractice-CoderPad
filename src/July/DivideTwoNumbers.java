package July;

public class DivideTwoNumbers {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        System.out.println(divide88(a, b));
    }

    private static int divide88(int divd, int divs) {
        if(divs ==0 )
            throw new IllegalArgumentException("Illegal argumnet");
        boolean negative = false;
        if(divd < 0){
            negative = !negative;
            divd = -divd;

        }
        if(divs < 0){
            negative = !negative;
            divs = -divs;
        }
        int q = 0;
        while(divd >= divs){
            divd -= divs;
            q++;
        }
        return negative ? -q : q;

    }
}
