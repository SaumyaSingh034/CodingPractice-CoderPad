package CodePardFinal;

public class CalculatePower {
    public static void main(String[] args){
        int base = 2;
        int exp = -2;
        //Op--> 2*2*2;
        calculatePower(base, exp);
    }

    private static void calculatePower(int base, int exp) {
        int product = 1;

        while(exp > 0){
            product = product * base;
            exp--;
        }
        System.out.println(product);
    }
}
