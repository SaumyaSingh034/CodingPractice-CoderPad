package July;

public class LongestUniformStubstrin {
    public static void main(String[] args){
        String str = "automatiiiiiiiion";
        longestUniformSubstring9877(str);


    }

    private static void longestUniformSubstring9877(String str){
        int longestStart = 0;
        int longestLength = 0;
        int i = 1;
        int length = str.length();
        while(i < length){
            int start = i-1;
            int currentLength = 1;
            while(i < length && str.charAt(i) == str.charAt(i-1)){
                i++;
                currentLength++;
            }
            if(currentLength > longestLength){
                longestStart = start;
                longestLength = currentLength;
            }
            i++;
        }
        System.out.println(longestStart);
        System.out.println(longestLength);
        System.out.println(str.substring(longestStart, longestStart+longestLength));

    }
}
