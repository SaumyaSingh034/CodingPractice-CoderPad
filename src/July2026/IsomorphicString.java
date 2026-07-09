package July2026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {
    public static void main(String[] args){
        String s = "paper";
        String t = "title";
       System.out.println( isomorphicString(s, t));

    }

    private static boolean isomorphicString(String s, String t) {
        Map<Character, Character> data1 = new HashMap<>();
        Map<Character, Character> data2 = new HashMap<>();
        if(s == null || t==null || s.isEmpty() || t.isEmpty()){
            throw new IllegalArgumentException("The STring are Empty");
        }
        if(s.length()!= t.length())
           return false;
        for(int i=0;i<s.length();i++){
            char cS = s.charAt(i);
            char cT = t.charAt(i);

            if(data1.containsKey(cS)){
                if(data1.get(cS) != cT)
                    return false;
            }else{
                data1.put(cS, cT);
            }

            if(data2.containsKey(cT)){
                if(data2.get(cT) != cS)
                    return false;
            } else{
                data2.put(cT, cS);
            }
        }
        return true;

    }
}
