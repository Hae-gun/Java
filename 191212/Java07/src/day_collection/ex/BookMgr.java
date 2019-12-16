package day_collection.ex;
import java.util.*;

import javax.swing.JOptionPane;






public class BookMgr {
	
	Map<String, String> map = new HashMap<String, String>();
	ArrayList<Book> bookList = null;
   
	Scanner scanner = new Scanner(System.in);
    
    public BookMgr(){
    	bookList = new ArrayList<Book>();
    }
    
    
	public void addBook(Book book){
		
//		if()) {
//			System.out.println("중복");
//			return;
//			
//		}
		bookList.add(book);
	}
	
	public void deleteBook() {
		
		if(bookList.isEmpty()) {
			System.out.println("목록이 없음.");
			return;
		}
		System.out.println("삭제할 도서 이름 입력");

		
		String keyword = scanner.nextLine().trim();
		
		
		Iterator it = bookList.iterator();
		//삭제
		while(it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.getTitle().contains(keyword)) {
				System.out.println(book);
				System.out.println("정말 삭제할거니?");
				String yy = scanner.nextLine().trim();
				if(yy.equalsIgnoreCase("y")) {
					it.remove();
					}
			}
		}
		
		
		
	}
	
	public void searchBook() {
		
		if(bookList.isEmpty()) {
			System.out.println("목록이 없음.");
			return;
		}
		
		System.out.println("검색할 도서 이름 입력");
		String keyword = scanner.nextLine().trim();
		
		
		Iterator it = bookList.iterator();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.getTitle().toUpperCase().contains(keyword.toUpperCase()))
				System.out.println(book);
			else
				System.out.println("없음");
		}
		
		
		
	
	}
	public void printBookList(){ //모든목록 출력
		if(bookList.isEmpty()) {
			System.out.println("목록이 없음.");
			return;
		}
		System.out.println("***********  Book List ************");
		
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		
		System.out.println("***********************************");
	}
	
	public void printTotalPrice(){
		if(bookList.isEmpty()) {
			System.out.println("목록이 없음.");
			return;
		}
		int sum = 0;
		
		
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			sum += book.getPrice();
		}
		
		
		System.out.println("가격 총합: "+sum);
		
	}
	public void changeTitle() {
		if(bookList.isEmpty()) {
			System.out.println("목록이 없음.");
			return;
		}
		
		System.out.println("수정할 도서 이름 입력.");
		String msg = scanner.nextLine().trim();
		
		Iterator<Book> it = bookList.iterator();
		

		System.out.println("수정할 이름 입력:");	
		String rename = scanner.nextLine().trim();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
		
			if(book.getTitle().contains(msg)) {
				book.setTitle(rename);
				
			}else {
				System.out.println("없는 책");
				continue;
			}
		System.out.println("계속 변경?y");
		msg = scanner.nextLine().trim();
		if(!msg.equalsIgnoreCase("y".trim()))
			break;
		else {		
			System.out.println("수정할 이름 입력:");	
			rename = scanner.nextLine().trim();
			}
		
		}
		
	}
	public void END() {
		
		scanner.close();
		scanner = null;
	}
	
}
