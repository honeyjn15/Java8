package JAVA8;

import java.util.Arrays;
import java.util.List;

public class Random {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> lst= Arrays.asList(1,2,3,4,5,6,7,8);
	int sum =lst.stream().mapToInt(Integer::intValue).sum();
	System.out.println(sum);
	
	}

}
