package JAVA8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Frequency Of Character in String
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String findFrequencyOfChar = "VARDHAMAN";
        Map<Character, Long> collect = findFrequencyOfChar.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }


}
