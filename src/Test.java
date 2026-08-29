import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Number .... ");
        String number = sc.next();
        System.out.println(number);
        fetchTheLast4Digits(number);

    }

    private static void fetchTheLast4Digits(String number) {
        if(number == null || number.isBlank()){
            throw new IllegalArgumentException();
        }
        String last4Digit = number.substring(number.length() -4);
        System.out.println(last4Digit);
    }
}
