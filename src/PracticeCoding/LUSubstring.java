package PracticeCoding;

public class LUSubstring {
    public static void main(String[] args){
        String str = "aabbbbccccd";
        longestSubstring123(str);

    }

    private static void longestSubstring123(String str) {
        int maxStart = -1;
        int maxLength = 0;

        int i = 1;
        int length = str.length();
        while(i < length){
            int start = i-1;
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
        System.out.println(maxStart);
        System.out.println(maxLength);
        System.out.println(str.substring(maxStart, maxLength));
    }
}
