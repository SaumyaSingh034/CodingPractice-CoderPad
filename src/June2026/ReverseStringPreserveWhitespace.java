package June2026;

public class ReverseStringPreserveWhitespace {
    public static void main(String[] args){
        String str = "This is a sunny Day";
        reverseStringPreserveWhitespace12(str);
    }

    private static void reverseStringPreserveWhitespace12(String str) {
        String str1 = str.replaceAll(" ", "");
        StringBuilder result = new StringBuilder(str1);
        result.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                result.insert(i,' ');
            }
        }
        System.out.println(result);


    }
}
