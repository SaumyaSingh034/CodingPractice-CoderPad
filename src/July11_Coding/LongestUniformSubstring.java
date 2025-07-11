package July11_Coding;

public class LongestUniformSubstring {
    public static void main(String[] args){
        String str = "aaabbbbcddccdddbbeg";
        findLongestSubstring(str);
    }

    private static void findLongestSubstring(String str) {
        int maxLength = 0;
        int maxStart=0;
        int i=1;
        int length = str.length();
        while(i<length){
            int start = i-1;
            int currenLen = 1;
            while(i < length && str.charAt(i) == str.charAt(i-1)){
                i++;
                currenLen++;
            }
            if(currenLen > maxLength){
                maxStart = start;
                maxLength = currenLen;
            }
            i++;

        }
        System.out.println("Maxlength : "+maxLength);
        System.out.println("MaxStart : "+maxStart);
        System.out.println("Substring : "+str.substring(maxStart, maxStart+maxLength));
    }
}
