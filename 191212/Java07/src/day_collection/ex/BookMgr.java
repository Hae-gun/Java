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
//			System.out.println("�ߺ�");
//			return;
//			
//		}
		bookList.add(book);
	}
	
	public void deleteBook() {
		
		if(bookList.isEmpty()) {
			System.out.println("����� ����.");
			return;
		}
		System.out.println("������ ���� �̸� �Է�");

		
		String keyword = scanner.nextLine().trim();
		
		
		Iterator it = bookList.iterator();
		//����
		while(it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.getTitle().contains(keyword)) {
				System.out.println(book);
				System.out.println("���� �����ҰŴ�?");
				String yy = scanner.nextLine().trim();
				if(yy.equalsIgnoreCase("y")) {
					it.remove();
					}
			}
		}
		
		
		
	}
	
	public void searchBook() {
		
		if(bookList.isEmpty()) {
			System.out.println("����� ����.");
			return;
		}
		
		System.out.println("�˻��� ���� �̸� �Է�");
		String keyword = scanner.nextLine().trim();
		
		
		Iterator it = bookList.iterator();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.getTitle().toUpperCase().contains(keyword.toUpperCase()))
				System.out.println(book);
			else
				System.out.println("����");
		}
		
		
		
	
	}
	public void printBookList(){ //����� ���
		if(bookList.isEmpty()) {
			System.out.println("����� ����.");
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
			System.out.println("����� ����.");
			return;
		}
		int sum = 0;
		
		
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			sum += book.getPrice();
		}
		
		
		System.out.println("���� ����: "+sum);
		
	}
	public void changeTitle() {
		if(bookList.isEmpty()) {
			System.out.println("����� ����.");
			return;
		}
		
		System.out.println("������ ���� �̸� �Է�.");
		String msg = scanner.nextLine().trim();
		
		Iterator<Book> it = bookList.iterator();
		

		System.out.println("������ �̸� �Է�:");	
		String rename = scanner.nextLine().trim();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
		
			if(book.getTitle().contains(msg)) {
				book.setTitle(rename);
				
			}else {
				System.out.println("���� å");
				continue;
			}
		System.out.println("��� ����?y");
		msg = scanner.nextLine().trim();
		if(!msg.equalsIgnoreCase("y".trim()))
			break;
		else {		
			System.out.println("������ �̸� �Է�:");	
			rename = scanner.nextLine().trim();
			}
		
		}
		
	}
	public void END() {
		
		scanner.close();
		scanner = null;
	}
	
}
