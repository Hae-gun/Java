package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
			
		System.out.println("------------START-------------");
		Scanner scanner = null;
		
		
			try {
				scanner = new Scanner(new File("bookdata.txt"));
				
				while(scanner.hasNextLine()) {
				
					String[] data = scanner.nextLine().split(" ");//" "�� ���̷� �ɰ�.
					Book book = new Book(data[0], Integer.parseInt(data[1]));
					System.out.println(book);
				
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("�����غ�");
			}finally {
				if(scanner!=null)
				scanner.close();
			}
			
		
		System.out.println("-------------END--------------");
	}

}
