package day_collection.ex;
import java.util.*;
public class BookApp {
	public static void main(String[] args) {
		
		BookMgr mgr = new BookMgr();
        
		boolean exit = false;
		while(!exit) {
		System.out.println("1.��� 2.���� 3.�˻� 4.���� 5.������� 6.��ü ����Ʈ 7.����");
		Scanner scanner = new Scanner(System.in);
		int menu = scanner.nextInt();
		scanner.nextLine();
		
		
		switch(menu) {
		case 1:
			System.out.println("å��ȣ/�̸�/�����Է�");
			int ISBM = scanner.nextInt();
			String title = scanner.next();
			int price = scanner.nextInt();
			
			mgr.addBook(new Book(ISBM,title,price));
			
			break;
		
		case 2:mgr.deleteBook();
				break;
		
		case 3: mgr.searchBook();
				break;
			
		
		case 4:	mgr.changeTitle();
				break;
				
		case 5: mgr.printTotalPrice();
				break;
				
		case 6: mgr.printBookList();
				break;
				
		case 7: exit = !exit;
				mgr.END();
				break;
			
		default:System.out.println("���� �޴�");
		
		
		
		}
		
		}
		
		
		
		
		

	}
}
