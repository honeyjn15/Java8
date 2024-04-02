package JAVA8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name = Arrays.asList("J", "H", "A");
		 Collections.sort(name, (s1, s2) -> s1.compareTo(s2));
		 name.forEach(System.out::println);
	}

}
