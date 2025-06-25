package Practice1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Panagram {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args){
        String sentence  = "The quick brown fox jumps over the lazy dog";
        findMissingLetter(sentence);
    }

    private static void findMissingLetter(String sentence) {
        if(sentence == null || sentence.isEmpty())
            throw new IllegalArgumentException("The string is either null or empty");
        SortedSet<Character> sortedData = new TreeSet<>();
        StringBuilder result = new StringBuilder();

        for(int i=0;i<ALPHABET.length();i++){
            sortedData.add(ALPHABET.charAt(i));
        }
     for(int i=0;i<sentence.length();i++){
         sortedData.remove(sentence.charAt(i));
     }
     for(Character c : sortedData){
         result.append(c);
     }
     System.out.println(result.toString().trim());
    }
}
