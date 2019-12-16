package day06;

public class BookMgr {

	
	
	public Book[] booklist;
	static int count=0;
	
	public BookMgr() {
		this(0);
	}
	public BookMgr(int mount) {
		
		booklist = new Book[mount];
	}
	public void addBook(Book book) {
		
		booklist[count] = book;
		count++;
		
		
		
	}
	public void printBookList() {
		for(int j=0; j<booklist.length; j++)
		System.out.println(booklist[j].getTitle());
	}
	
	public int printTotalPrice() {
		int sum=0;
		for(int j=0; j<booklist.length; j++) {
			
			sum += booklist[j].getPrice();
		}
			return sum;
	}
	

}
