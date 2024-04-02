package JAVA8;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Integer sum =lst.stream().mapToInt(s1 ->s1).sum();
		System.out.println(sum);
	}
}
