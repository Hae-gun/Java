package day10;

import java.util.*;

import javax.swing.JOptionPane;


public class Test06 {

	public static void main(String[] args) {

		Set<Book> booklist = new HashSet<Book>(); //CURD 등록 삭제 수정 검색 기능
		
		//등록작업
		
		if(booklist.add(new Book("Java", 500))) {
			System.out.println("등록완료");
		}else {
			System.out.println("중복");
		}
		booklist.add(new Book("SQL", 1500));
		booklist.add(new Book("JSP", 5500));
		if(booklist.add(new Book("Java", 500))) {
			System.out.println("등록완료");
		}else {
			System.out.println("중복");
		}
		booklist.add(new Book("Spring", 500));
		booklist.add(new Book("C", 500));
		booklist.add(new Book("Android", 500));

		//출력
		
		Iterator<Book> it = booklist.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		
		//검색
		String keyword = JOptionPane.showInputDialog("title검색");
		System.out.println(keyword+"도서 검색결과");
		
		
		it = booklist.iterator();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.title.toUpperCase().contains(keyword.toUpperCase()))
				System.out.println(book);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 도서 이름 입력");
		String msg = scanner.nextLine().trim();
		
		//삭제
		it = booklist.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.title.contains(msg)) {
				System.out.println(book);
				System.out.println("정말 삭제할거니?");
				String yy = scanner.nextLine().trim();
				if(yy.equalsIgnoreCase("y")) {
					it.remove();
					}
			}
		}
		//재출력
		it = booklist.iterator();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		
		//수정
		System.out.println("수정할 도서 이름 입력.");
		msg = scanner.nextLine().trim();
		
		it = booklist.iterator();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.title.contains(msg)) {
				book.title = book.title + "____";
			}
		}
		
	
		//재출력
		it = booklist.iterator();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		
		scanner.close();
		scanner = null;
		
		
	}
		
		

}


class Book{
	
	String title;
	int price;
	
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	



	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}