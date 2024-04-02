package JAVA8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLengthBasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name = Arrays.asList("Honey", "Jain", "married");
		name.stream().sorted(Comparator.comparingInt(String::length)).toList()
		
		.forEach(System.out::println);
		
}
}