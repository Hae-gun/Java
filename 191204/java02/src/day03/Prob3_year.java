package day03;
import java.util.*;
public class Prob3_year {

	public static void main(String[] args) {

		
		
		
		int year=0;
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("연도입력 : ");
		
		year=scanner.nextInt();
		scanner.nextLine();
		
		if((year%400==0)||((year%4==0)&&(year%100!=0))) {
			System.out.println(year+" 년은 윤년 입니다.");
			
		}else
			System.out.println(year+" 년은 윤년 아닙니다.");
		
		
		
		
		if(scanner!=null)scanner.close();
		scanner = null;
	
	}
}
