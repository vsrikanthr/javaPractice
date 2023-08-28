package java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums  = Arrays.asList(9,7,3,5,1,7,4,6);
		
		int reducedNum = nums.stream().filter(n -> n%2 == 1)
					.sorted()
					.map(n -> n*1)
					.reduce(0, (c,e)->c+e);
					//.forEach(n -> System.out.println(n));
		System.out.println(reducedNum);
		
		nums.parallelStream().forEach(n->System.out.println(n));

	}

} 
