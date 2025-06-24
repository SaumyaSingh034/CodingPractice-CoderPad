package CoderpadQuestions;

import java.util.SortedSet;
import java.util.TreeSet;

public class Panagram {
    private static class PanagramDetector {
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        public String findMissingLetters(String sentence) {
           SortedSet<Character> data = new TreeSet<>();
           StringBuilder result = new StringBuilder();
           for(int i=0;i<ALPHABET.length();i++){
               data.add(ALPHABET.charAt(i));
           }
           for(int i=0;i<sentence.length();i++){
               data.remove(sentence.charAt(i));
           }

           for(char c : data){
               result.append(c);
           }
            return result.toString();
        }

    }

    public static void main(String[] args) {
        PanagramDetector pd = new PanagramDetector();
        boolean success = true;

        success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

        if (success) {
            System.out.println("Pass ");
        } else {
            System.out.println("Failed");
        }
    }
}

