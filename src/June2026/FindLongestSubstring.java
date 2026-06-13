package June2026;

import java.util.HashSet;
import java.util.Set;

public class FindLongestSubstring {
    public static void main(String[] args){
        String str = "saumyasingh";
        findLongestSubstring090(str);

    }

    private static void findLongestSubstring090(String str) {
      int maxLength = 0, maxStart = 0, start = 0, end = 0;
      Set<Character> set = new HashSet<>();

      while(end < str.length()){
          char ch = str.charAt(end);
          if(set.contains(ch)){
              set.remove(str.charAt(start));
              start++;

          } else{
              set.add(ch);
              end++;

              if(end -start > maxLength){
                  maxLength = end-start;
                  maxStart = start;
              }
          }
      }
      System.out.println(str.substring(maxStart, maxStart + maxLength));
      System.out.println(maxLength);

    }
}
