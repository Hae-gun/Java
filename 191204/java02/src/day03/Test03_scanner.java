package day03;

import java.util.Scanner;

public class Test03_scanner {

	public static void main(String[] args) {

		
		String name = null;
		int kor = 0;
		int math = 0;
		
		/*System.out.println(name.length());//NullPointerException.*/
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("이름을 입력하세요_");
		name  = scanner.nextLine();		
		System.out.println(name.length());
		
		
		System.out.println("국어 점수을 입력하세요_");
		kor  = Integer.parseInt(scanner.nextLine());		
		
		/*scanner = null;		//NullPointerException.*/
		
		System.out.println("수학 점수을 입력하세요_");
		math  = scanner.nextInt();	
		scanner.nextLine();
		
		System.out.printf("이름: %s 국어: %d 수학: %d %n",name, kor, math);
		double avg = (kor+math)/2.;
		System.out.printf("평균 : %.2f => %s",avg,(avg>=85?"합격!!!":"불합격ㅠㅠ" ));//?뒤 데이터타입 일치 "
		
		scanner.close();	//null 할당 하기전 close를 해줘야함.(자원반납)
		scanner = null;		//가비지 대상으로 알려주는 일,
		return;
	}

}
