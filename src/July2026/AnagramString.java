package July2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnagramString
{
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        Boolean result = checkTheStringareAnagram(s, t);
        System.out.println(result);
        anagramWithOutSort(s, t);
    }

    private static Boolean anagramWithOutSort(String s, String t) {
        if(s == null || t==null || s.isEmpty() || t.isEmpty()){
            throw new IllegalArgumentException("The STring are Empty");
        }
        if(s.length()!= t.length())
            return false;
       StringBuilder data = new StringBuilder(s);
       data.append(t);
       Set<Character> linked = new HashSet<>();
       for(char c : data.toString().toCharArray()){
           if(linked.contains(c)){
               linked.remove(c);
           }else{
               linked.add(c);
           }
       }
       System.out.println(linked);
       return linked.isEmpty();
    }

    private static Boolean checkTheStringareAnagram(String s, String t) {
        if(s == null || t==null || s.isEmpty() || t.isEmpty()){
            throw new IllegalArgumentException("The STring are Empty");
        }
        if(s.length()!= t.length())
            return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
