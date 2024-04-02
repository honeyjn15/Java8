package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> even=lst.stream().map(s1->s1.valueOf(s1)).filter(s1->s1%2==0).collect(Collectors.toList());
		System.out.print(even);
		
	}

}
