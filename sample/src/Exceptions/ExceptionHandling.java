package Exceptions; 
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		      int data=100/1;  
		      int a[]=new int[5];  
		      a[10]=50; 
		   }
		 catch(Exception e){
			System.out.println(e);
			
			}  
		finally {  
			System.out.println("default");  
			}    
		
		
	}

}
