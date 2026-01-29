package Intermediate;

public class ReverseEachWord {
    public static void main(String[] args){
        String sentence = "Hi I am Senior Test Automation Engineer";
        reverseEachWordInSenstence(sentence);
    }

    private static void reverseEachWordInSenstence(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s");
        for(String s : words){
            StringBuilder word = new StringBuilder(s);
            result.append(word.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
