package October2026;

public class ReverseWords {

    public static void main(String[] args){
        String words = "I love java programming and also proud to be a skilled sdet";
        reverseWords(words);
        reverseEachWords(words);
    }

    private static void reverseEachWords(String words) {
        if(words == null || words.isEmpty())
            throw new IllegalArgumentException();
        StringBuilder result = new StringBuilder();
        StringBuilder reverse;
        String[] word = words.split(" ");
        for(int i=word.length-1;i>=0;i--){
            reverse = new StringBuilder(word[i]);
            result.append(reverse.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    private static void reverseWords(String words) {
        if(words == null || words.isEmpty())
            throw new IllegalArgumentException();
        StringBuilder result = new StringBuilder();
        String[] word = words.split(" ");
        for(int i=word.length-1;i>=0;i--){
            result.append(word[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
