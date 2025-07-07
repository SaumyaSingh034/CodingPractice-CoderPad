package CodePardFinal;

public class Powerof10 {
    public static void main(String[] args){
        int number = 100;
        for(int i=1;i<=number;i *= 10){
            if(number == i)
                System.out.println("True");
            else if (number > Integer.MAX_VALUE/10) {
                System.out.println("False");
            }
        }

    }
}
