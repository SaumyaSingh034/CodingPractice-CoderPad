package October2026;

public class Palindrom {

    public static void main(String[] args){
        String str = "madam";
        int number = 131131;

        validatePalindrom(str);
        validatePalindrom(String.valueOf(number));
    }

    private static void validatePalindrom(String str) {
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        System.out.println(str.contentEquals(reverse));
    }
}
