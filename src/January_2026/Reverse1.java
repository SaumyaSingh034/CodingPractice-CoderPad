package January_2026;

public class Reverse1 {
    public static void main(String[] args){
        String str = "Goldman";
        reverseStringUsingInput(str);
    }

    private static void reverseStringUsingInput(String str) {
        StringBuilder reverse = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);
    }
}
