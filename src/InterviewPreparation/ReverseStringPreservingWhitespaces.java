package InterviewPreparation;

public class ReverseStringPreservingWhitespaces {
    public static void main(String[] args){
        String str = "This is a sunny day";
        reverseStringPreservingWhiteSpaces(str);

    }

    private static void reverseStringPreservingWhiteSpaces(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(String s : words){
            result.append(s);
        }
        result.reverse();
        for(int i = 0;i< str.length();i++){
            if(str.charAt(i) == ' '){
                result.insert(i, ' ');
            }
        }
        System.out.println(result);
    }
}
