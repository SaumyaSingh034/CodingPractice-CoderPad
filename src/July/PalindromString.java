package July;

public class PalindromString {
    public static void main(String[] args){
        String str = "madam";
        String str1 = "racecar";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str1));

    }

    private static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()))
            return true;

        return false;
    }
}
