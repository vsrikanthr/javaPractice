package ObjectCreation;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String args[]) {
    	
    	//Student 1
    	Student student1 = new Student("john", 3, "newyork");
    	student1.setId(9999999);
    	System.out.println(student1.getId());
    	System.out.println(student1.toString());
    	
    	//Student 2 By Scanner 
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter Student2 details");
    	String name = scanner.nextLine();
    	long id = scanner.nextLong();
    	scanner.nextLine();
    	String address = scanner.nextLine();
    	Student student2 = new Student(name, id, address);
    	System.out.print(student2.toString());
    	
    }
}
