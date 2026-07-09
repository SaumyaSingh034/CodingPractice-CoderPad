package July2026;

import java.util.*;

public class AnagramString
{
    public static void main(String[] args){
        String s = "aaab";
        String t = "abbb";
        Boolean result = checkTheStringareAnagram(s, t);
        System.out.println(result);
        anagramWithOutSort(s, t);
        System.out.println(anagramWithOutSortWithHashMap(s, t));
    }

    private static Boolean anagramWithOutSortWithHashMap(String s, String t) {
        Map<Character, Integer> data = new HashMap<>();
        if(s == null || t==null || s.isEmpty() || t.isEmpty()){
            throw new IllegalArgumentException("The STring are Empty");
        }
        if(s.length()!= t.length())
            return false;
        for(char c : s.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray()){
            if(data.containsKey(c)){
                data.put(c, data.getOrDefault(c, 0)-1);
            }else{
               return false;
            }
        }
        boolean result= false;
        for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue()<0){
                return false;
            }else if(dataSet.getValue() == 0){
                result = true;
            } else
                return false;
        }
        System.out.println(data);
        return result;
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
