package CoderPadPractice;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String[] inputs = {"apple", "racecars", "ababdc"};
        firstNonRepeatedCharacter(inputs);

    }

    private static void firstNonRepeatedCharacter(String[] inputs) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        List<Character> value = new ArrayList<>();
        for (String word : inputs) {
            for (char c : word.toCharArray()) {
                data.put(c, data.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> dataSet : data.entrySet()) {
                if (dataSet.getValue() == 1) {
                    value.add(dataSet.getKey());
                    data.clear();
                    break;
                }
            }
        }
        System.out.println(value);
    }

}
