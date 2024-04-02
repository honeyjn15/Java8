package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//USe of PartioningBy
public class PartioningBy {

    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1,2,3,4,5,5,7,8);
        Map<Boolean, List<Integer>> seperatingOddEven = lst.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even Result"+seperatingOddEven.get(true));
        System.out.println("ODD Result "+seperatingOddEven.get(false));


    }
}
