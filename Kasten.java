public class Kasten {
	private String name;
	private int price;
	private int width;
	
	public Kasten(String name, int width, int price) {
		this.name = name;
		this.width = width;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getWidth() {
		return width;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name + " - €" + price;
	}
}

