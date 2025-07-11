package July11_Coding;

public class ReverseNumber {
    public static void main(String[] args){
        int number = 351; //153
        reverseANumber(number);
    }

    private static void reverseANumber(int number) {
        int reverse = 0;
        while(number!=0){
            int n = number%10; //3
            reverse = reverse*10 + n;
            number = number/ 10;
        }
        System.out.println(reverse);
    }
}
