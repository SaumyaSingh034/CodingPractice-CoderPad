package MockerPadQuestions;

public class LongestUniformEditor {
    public static void main(String[] args){
        String str = "ssaauummyyYYaaaa";
        longest(str);
    }

    private static void longest(String str) {
        int maxStart = -1;
        int maxLength = 0;
        int i = 1;
        int length = str.length();
        while(i < length){
            int start = i-1;
            int currentLen = 1;
            while(i < length && str.charAt(i) == str.charAt(i-1)){
                i++;
                currentLen++;
            }
            if(currentLen > maxLength){
                maxStart = start;
                maxLength = currentLen;
            }
            i++;
        }
        System.out.println(str.substring(maxStart));
    }

}
