package CoderPadPractice;

public class LongestUniformSubstring {
    public static void main(String[] args) {
        String str = "ssaaUUUUUUUmmmYYYaaaaa";
        findLongestUniformString(str);

    }

    private static void findLongestUniformString(String str){
        int maxStart = -1;
        int maxLength = 0;
        int i=1;
        int length = str.length();
        while(i < length){
            int start = i-1;//0
            int currentLength = 1;
            while(i < length && str.charAt(i) == str.charAt(i-1)){
                //s == s
                i++;//2
                currentLength++; //2
            }
            if(currentLength > maxLength){
                maxStart = start;
                maxLength = currentLength;
            }
            i++;
        }
        System.out.println(maxLength);
        System.out.println(maxStart);
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
