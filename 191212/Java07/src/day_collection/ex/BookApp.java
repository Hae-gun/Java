package day_collection.ex;
import java.util.*;
public class BookApp {
	public static void main(String[] args) {
		
		BookMgr mgr = new BookMgr();
        
		boolean exit = false;
		while(!exit) {
		System.out.println("1.등록 2.삭제 3.검색 4.변경 5.가격출력 6.전체 리스트 7.종료");
		Scanner scanner = new Scanner(System.in);
		int menu = scanner.nextInt();
		scanner.nextLine();
		
		
		switch(menu) {
		case 1:
			System.out.println("책번호/이름/가격입력");
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
			
		default:System.out.println("없는 메뉴");
		
		
		
		}
		
		}
		
		
		
		
		

	}
}
