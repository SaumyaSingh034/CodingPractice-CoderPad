package Beginner;

public class StringPalindrome {
    public static void main(String[] args){
        String str1 = "saaumya";
        String str2 = "madam";
        checkStringPalindrome(str2);
    }

    private static void checkStringPalindrome(String str1) {
        StringBuilder reverseString = new StringBuilder(str1);
        if(str1.contentEquals(reverseString.reverse()))
            System.out.println("PALINDROME");
        else{
            System.out.println("NOT PALINDROME");
        }

    }
}
