package oops;

public class BMWClass implements Car {
	
	private String color;
	private int price;
	
	
	
	
	

	public BMWClass(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}




	public String getColor() {
		return color;
	}




	public int getPrice() {
		return price;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	@Override
	public void carInfo() {
		// TODO Auto-generated method stub
		System.out.println("BMW Car");
		
	}




	@Override
	public String toString() {
		return "BMWClass [color=" + color + ", price=" + price + "]";
	}
	
	

}
