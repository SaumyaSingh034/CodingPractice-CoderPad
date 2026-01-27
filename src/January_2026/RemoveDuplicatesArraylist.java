package January_2026;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesArraylist {
    public static void main(String[] args){
        List<Integer> data = new ArrayList<>();
        data.add(3);
        data.add(3);
        data.add(5);
        data.add(7);
        data.add(4);
        data.add(5);
        System.out.println(removeDuplicatesFromArrayList(data));
    }

    private static List<Integer> removeDuplicatesFromArrayList(List<Integer> data) {
        return data.stream().distinct().toList();
    }
}
