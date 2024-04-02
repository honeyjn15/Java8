package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElementInArray {
    public static void main(String[] args) {
        List<Integer> frequencyOfElement = Arrays.asList(1,2,3,4,2,4,1,3);

        Map<Integer, Long> x = frequencyOfElement.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(x);
    }
}
