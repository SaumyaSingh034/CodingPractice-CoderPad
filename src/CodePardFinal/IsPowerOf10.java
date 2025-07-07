package CodePardFinal;

public class IsPowerOf10 {
    public static void main(String[] args){
        int number = 1000;
        checkPower10(number);
    }

    private static boolean checkPower10(int number) {
        for(int i=1;i<=number;i *= 10){
            if(i == number)
                return true;
            else if(number>Integer.MAX_VALUE/10)
                return false;
        }
           return false;
    }
}
