package oops;

public class HondaClass implements Car {
	
	private String color;
	private int price;
	
	
	

	public HondaClass(String color, int price) {
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
		System.out.println("Honda Car");
	}
	
	public void something() {
		System.out.println("Something something");
	}




	@Override
	public String toString() {
		return "HondaClass [color=" + color + ", price=" + price + "]";
	}

	
}
