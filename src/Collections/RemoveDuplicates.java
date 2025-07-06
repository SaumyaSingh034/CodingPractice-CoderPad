package Collections;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "java", "c++", "python");
        List<String> result = names.stream().distinct().sorted().toList();
        System.out.println(result);

    }
}
