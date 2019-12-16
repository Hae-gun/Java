package day06;

public class Book {
	
	private String title;
	private int price;
	static int mount = 0;
	
	public Book() {
		this(null,0);
	}
	public Book(String title, int price) {
		setTitle(title);
		setPrice(price);
		mount++;
		
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}
	public int getMount() {
		return mount;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	
	
	

	
	
	
	
}

