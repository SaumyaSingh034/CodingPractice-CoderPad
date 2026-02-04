package Fenruary_2026;

public class FetchNumbersSum {
    public static void main(String[] args){
        String str = "saumya23456&*^yu2";
        fetchNumberAndSum(str);
    }

    private static void fetchNumberAndSum(String str) {
        int sum = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}
