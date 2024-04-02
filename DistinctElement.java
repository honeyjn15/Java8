package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst= Arrays.asList(1,2,3,4,5,5,7,8);
		List<Integer> x = lst.stream().distinct().collect(Collectors.toList());
		System.out.println(x);
	}

}
 