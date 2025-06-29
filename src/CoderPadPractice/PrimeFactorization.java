package CoderPadPractice;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorization {
    public static void main(String[] args){
        int number = 6;
        System.out.println(primeFactorization123(number));
    }

    private static List<Integer> primeFactorization123(int number) {
        List<Integer> factors = new ArrayList<>();
        if(number < 2)
            return factors;

        for(int i=2;i<=number;i++){ //3  --> 6
            if(number % i == 0){ //0
                number = number/i; //3
                factors.add(i); //2
            }
        }
        return factors;

    }
}
