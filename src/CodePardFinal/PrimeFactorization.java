package CodePardFinal;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args){
        int number = 6;
        System.out.println(primeFactorizationCheck(number));
    }

    private static List<Integer> primeFactorizationCheck(int number) {
       List<Integer> factors = new ArrayList<>();
       if(number < 2)
           return factors;
       for(int i=2;i<=number;i++){
           if(number % i == 0){
               number = number/i;
               factors.add(i);
           }
       }
       return factors;
    }
}
