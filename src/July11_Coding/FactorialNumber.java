package July11_Coding;

public class FactorialNumber {
    public static void main(String[] args){
        int number = 5;
        findFactorial(number);
    }

    private static void findFactorial(int number) {
        int product = 1;
        int i=1;
        while(i<=number){
            product *= i;
            i++;
        }
        System.out.println(product);
    }
}
