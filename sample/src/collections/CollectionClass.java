package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List numList = new ArrayList<Integer>();
		
		numList.add(5);
		numList.add(99);
		numList.add(76);
		numList.add(32);
		numList.add(23);
		System.out.println(numList);
		System.out.println(numList.indexOf(99));
		numList.remove(4);
		System.out.println(numList);
		numList.add(0, 55);
		System.out.println(numList);
		Object[] arrays = numList.toArray();
		for(Object i: arrays) {
			System.out.println(i);
		}
		
		Set<String> ts1 = new TreeSet<>();
		
		ts1.add("j");
		ts1.add("c");
		ts1.add("b");
		ts1.add("a");
		ts1.add("p");
		System.out.println(ts1);
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 22);
		hm.put("b", 32);
		hm.put("c", 252);
		System.out.println(hm.remove("b"));
		System.out.println(hm);
		
		
	}

}
