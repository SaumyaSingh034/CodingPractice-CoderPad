package Fenruary_2026;

public class PowerOfTen {
    public static void main(String[]args) {
        int number = 100;
        System.out.println(checkIsPowerOfTen(number));
    }

    private static boolean checkIsPowerOfTen(int number) {
        if(number < 1)
            return false;
        while(number%10==0){
            number = number/10;
        }

        return number == 1;
    }
}
