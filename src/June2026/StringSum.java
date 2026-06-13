package June2026;

public class StringSum {
    public static void main(String[] args){
        String str = "saumya23456&*^yu2";
        akhirs_fetchNum(str);
    }

    private static void akhirs_fetchNum(String str) {
        int sum = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
