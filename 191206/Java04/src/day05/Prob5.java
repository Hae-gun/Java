package day05;
import java.util.*;
public class Prob5 {
	public static void main(String args[]) {
		
		
		System.out.println( Prob5.leftPad("SDS", 6, '#') );
		System.out.println( Prob5.leftPad("SDS", 5, '$') ); 
		System.out.println( Prob5.leftPad("SDS", 2, '&') ); 
		
		Scanner scanner = new Scanner(System.in);
		String exit = "";
		int num =0;
		char code ='a';
		
		while(!exit.equals("y")) {
		
			System.out.println("����� y�Է�");
			exit = scanner.nextLine().toLowerCase();
			
			if(!exit.equals("y")) {
				System.out.println("����,�ѱ���, ��ȣ �Է�");
				String St = scanner.next();
				num = scanner.nextInt();
				code = scanner.nextLine().charAt(1);
			
			System.out.println(Prob5.leftPad(St,num,code));
			}
		
		}
		System.out.println("����");
		
	}
	
	
	
	public static String leftPad(String str, int size, char padChar) {
		
		StringBuilder result = new StringBuilder();
			
			
		for(int i=0; result.length()<size-str.length();i++) {
			result.append(padChar);
		}
		
		result.append(str);
		return result.toString();
		
	}
}  