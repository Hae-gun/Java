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
		System.out.println("=== å ��� ===");
		BM.printBookList();
		System.out.println();
		System.out.println("=== å ������ ����  ===");
		System.out.println("��ü å ������ �� :"+BM.printTotalPrice());
		

	}

}
