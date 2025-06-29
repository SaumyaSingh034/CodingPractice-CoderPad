package June;

public class LongestUniformSubstring {
    public static void main(String[] args){
        String str = "saaaauuuummmmyyyyyyyyyyyyaa";
        longestUniform1112(str);
    }

    private static void longestUniform1112(String str) {
        int maxStart = -1;
        int maxLength = 0;
        int i=1;
        int length = str.length();
        while(i<length){
            int start = i-1; //0
            int currentLength = 1;
            while(i < length && str.charAt(i) == str.charAt(i-1)){
                i++;
                currentLength++;
            }
            if(currentLength > maxLength){
                maxStart = start;
                maxLength = currentLength;
            }
            i++;
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
