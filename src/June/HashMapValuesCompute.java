package June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapValuesCompute {
    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();
        data.put("ABC", 89);
        data.put("IUH", 12);
        data.put("IKJ", 9);
        data.put("DBC", 8);
        data.put("IUU", 19);
        sortHashValues888(data);

    }

    private static void sortHashValues888(Map<String, Integer> data) {
//        List<Map.Entry<String, Integer>> compute = new ArrayList<>(data.entrySet());
//        compute.sort(Map.Entry.comparingByValue());
//        for(Map.Entry<String, Integer> d : compute){
//            System.out.println(d.getKey()+" --> "+d.getValue());
//        }

        data.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
