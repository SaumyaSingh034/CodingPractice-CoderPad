package October2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        String str = "I love working with Goldman Sachs";
        String str1 = "I love working with Goldman Sachs I love working with Goldman Sachs";
        removeDuplicates_01(str);
        removeDuplicates_01(str1);
    }

    private static void removeDuplicates_01(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        Set<String> data = new LinkedHashSet<>();

        for(String word : str.split(" ")){
            if(!data.contains(word)){
                data.add(word);
            }
        }
        System.out.println(data);
    }
}
