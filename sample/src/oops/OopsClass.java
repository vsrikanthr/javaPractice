package oops;



public class OopsClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass subObj = new SubClass();
		subObj.info();
		subObj.something();
		
		SuperClass subobj2;
		subobj2 = new SubClass();
		subobj2.info();
		subobj2 = new SubClass2();
		subobj2.info();
		
		
		
		HondaClass car = new HondaClass("black",40000);
		System.out.println(car.toString());
		car.getColor();
		car.something();
		
		Car car2 = new HondaClass("White",566777);
		car2.carInfo();
		
	}

}
