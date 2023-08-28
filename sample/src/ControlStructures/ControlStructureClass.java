package ControlStructures;

public class ControlStructureClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,7,1,4,9,6,8,2,4,8};
		
		String[] cars = {"Volvo","BMW","audi","Honda"};
		
		int[] n = new int[5];
		
		n[0] = 33;
		n[1] = 56;
		n[2] = 99;
		n[3] = 23;
		n[4] = 76;
		
		for(int i=0;i< nums.length;i++) {
			
			if(nums[i]%2 ==0) {
				System.out.println("even Number: "+nums[i]);
			}
			else {
				System.out.println("Odd Number: "+nums[i]);
			}
			
		}
		
		int counter = n.length;
		int index;
		do {
			index = n.length - counter;
			System.out.println(n[index]);
			counter--;
		}
		while(counter > 0) ;	
		
	}

}
