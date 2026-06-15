package June2026;

import java.util.HashSet;
import java.util.Set;

public class AKHIRS_LongestUniqueSubstring {
    public static void main(String[] args){
        String str = "saumyasingh";
        longestUniqueSubstring6151(str);
    }

    private static void longestUniqueSubstring6151(String str) {
        int maxLength = 0, maxStart = 0, end= 0, start = 0;
        Set<Character> unique = new HashSet<>();
      while(end < str.length()){
          char c = str.charAt(end);
          if(!unique.contains(c)){
              unique.add(c);
              end++;

              if(end-start > maxLength){
                  maxLength = end-start;
                  maxStart = start;
              }
          }else{
              unique.remove(str.charAt(start));
              start++;
          }
      }

      System.out.println(maxLength);
      System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
