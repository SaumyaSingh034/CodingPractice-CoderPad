package January_2026;

public class ReverseEachWords {
    public static void main(String[] args){
        String str = "Java Automation Test";
        reverseEachWordInSentence(str);
    }

    private static void reverseEachWordInSentence(String str) {
        StringBuilder result = new StringBuilder();
        for(String word : str.split("\\s+")){
            result.append(new StringBuilder(word).reverse().append(" "));
        }
        System.out.println(result);
    }
}
