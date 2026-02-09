package July;

public class ReverseString {
    public static void main(String[] args){
        String str = "saumyasingh";
        String str1 = "so";
        System.out.println(reverseString(str1));
    }

    public static String reverseString(String str) {
        if(str == null || str.isEmpty())
            throw new IllegalArgumentException("String is empty or null");
        if(str.length() == 1)
            return str;
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
