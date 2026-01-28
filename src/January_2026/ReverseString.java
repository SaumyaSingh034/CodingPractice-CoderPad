package January_2026;

public class ReverseString {
    public static void main(String[] args){
        String str = "saumya";
        reverseStringWithoutInbuilt(str);
    }

    private static void reverseStringWithoutInbuilt(String str) {
        StringBuilder reverse = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }

        System.out.println(reverse);
    }
}
