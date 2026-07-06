package July2026;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString_Hard {
    public static void main(String[] args){
        String str = "I-Love@Java";
        revserStringBySpecialChar(str);
    }

    private static void revserStringBySpecialChar(String str) {
       String[] words = str.split("[^a-zA-Z0-9]");
       System.out.println(Arrays.toString(words));
       StringBuilder result = new StringBuilder();
       int wordLength = words.length-1;
       int i=0;
       while(i < str.length()){
           if(Character.isLetterOrDigit(str.charAt(i))){
               result.append(words[wordLength--]);

               while(i < str.length() && Character.isLetterOrDigit(str.charAt(i))){
                   i++;
               }
           } else{
               result.append(str.charAt(i));
               i++;
           }
       }
       System.out.println(result);
    }
}
