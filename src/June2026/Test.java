package June2026;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10,20,30,40,50);

        list.stream()
            .filter(n -> n > 20)
            .map(n -> n * 2) //60, 80,100
            .skip(1)
            .limit(2)
            .forEach(System.out::println);
    }
}