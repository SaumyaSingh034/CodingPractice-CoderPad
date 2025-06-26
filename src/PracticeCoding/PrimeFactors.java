package PracticeCoding;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args){
       System.out.println( isPrimeFactor12(6));
    }

    private static List<Integer> isPrimeFactor12(int i) {
        List<Integer> factors = new ArrayList<>();
        if(i < 2)
            return factors;
        for(int j = 2;j<=i;j++){
            if(i%j == 0 ){
                i = i/j;
                factors.add(j);
            }
        }

        return factors;
    }
}
