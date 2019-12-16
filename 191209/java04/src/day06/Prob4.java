package day06;

public class Prob4 {

	public static void main(String[] args) {
		
		Book[] book = {new Book("Java Program",12000),
				new Book("JSP Program",12000),
				new Book("SQL Fundamentals",12000),
				new Book("SQL Fundamentals",12000),
				new Book("SQL Fundamentals",12000)
				,new Book("JDBC Program",12000)
				,new Book("EJB Program",12000)};
		
		BookMgr BM = new BookMgr(book[0].getMount());
		
		for(int i = 0; i<book.length;i++) {
			BM.addBook(book[i]);
			
		}
		System.out.println("=== 책 목록 ===");
		BM.printBookList();
		System.out.println();
		System.out.println("=== 책 가격의 총합  ===");
		System.out.println("전체 책 가격의 합 :"+BM.printTotalPrice());
		

	}

}
