package CodePardFinal;

public class LongestUniformSubString {
    public static void main(String[] args){
        String input = "abcabcabcdddderffdddhujklnooo";
        int[] result = longestUniformSubstringCheck(input);
        System.out.println("Max Length : "+result[1]);
        System.out.println("Substring : "+input.substring(result[0], result[0]+result[1]));

    }

    private static int[] longestUniformSubstringCheck(String input) {
        int maxStart = 0;
        int maxLength = 0;
        int i=1;
        int length = input.length();

        while(i < length){
            int start = i-1;
            int currentLen = 1;
            while(i < length && input.charAt(i) == input.charAt(i-1)){
                i++;
                currentLen++;
            }
            if(currentLen > maxLength){
                maxStart = start;
                maxLength = currentLen;
            }
            i++;
        }
        return new int[]{maxStart, maxLength};
    }
}
