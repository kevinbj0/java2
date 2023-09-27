package java2.lamda;

public class Good {
	String name;
	int price;
	int count;
	
	public Good(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		this.count = 0;
	}
	public Good() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Good [name=" + name + ", price=" + price + ", count=" + count + "]";
	}


	
}
