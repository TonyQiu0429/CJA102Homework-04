package hw5;

public abstract class Pen {
	protected String brand; 
	protected int price;
	
	public Pen() {
		this.brand = brand;
		this.price = price;
	}
	public Pen(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
	public void setBrandAndPrice(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public abstract void write();
}
