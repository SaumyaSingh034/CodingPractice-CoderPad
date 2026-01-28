package Beginner;

public class Prime {
    public static void main(String[] args){
        int number = 4771;
        checkNumberisPrimeOrNot(number);
    }

    private static void checkNumberisPrimeOrNot(int number) {
        if(number <=1){
            System.out.println("NOT PRIME");
        }
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i==0){
                isPrime = false;
                break;

            }
        }
        if(isPrime)
            System.out.println("PRIME");
        else
            System.out.println("NOT PRIME");
    }
}
