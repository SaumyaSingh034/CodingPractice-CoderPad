package Practice1;

import java.util.*;

public class GroupsOfAnagram {
    public static void main(String[] args){
        String input = "cat dog tac sat tas god dog";
        groupsAnagram123(input);
    }

    private static void groupsAnagram123(String input) {
        String[] inputs = input.split("\\s+");
        Map<String, List<String>> hashMap = new LinkedHashMap<>();
        for(String data : inputs){
            char[] ch = data.toCharArray();
            Arrays.sort(ch);
            String value = new String(ch);
            hashMap.computeIfAbsent(value, v-> new ArrayList<>()).add(value);
        }

        StringBuilder result = new StringBuilder();
        System.out.println(hashMap);
        for(List<String> data : hashMap.values()){
            result.append(data).append(" ");
        }
        System.out.println(result);

    }
}
