package java8Features;

public interface FuncInterface {
	
	void abstractFunc();
	
	default void normalFunc() {
		System.out.println("Default inteface method");
	}
	
	static void staticFunc() {
		System.out.println("Static interface method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncInterface objFuncInterface = ()-> System.out.println("Function Interface method");
		
		objFuncInterface.normalFunc();
		FuncInterface.staticFunc();
		
		objFuncInterface.abstractFunc();
	

	}

}
