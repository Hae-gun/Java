package day04;
import java.io.FileInputStream;
import java.util.*;

public class Test01_switch { //class name 대문자로.
	
	public static void main(String[] args) throws Exception {
		
		/*String studentName; //변수 메소드 name 소문자 시작. 카멜기호법 이용*/
		System.out.println("App 시작...");
		String name = null;
		int kor=0,eng=0,math=0;
		Scanner scanner = 
		new Scanner(new FileInputStream("c://lib/score.txt"),"UTF-8");

//		System.out.println("성적처리를 종료하려면 quit를 입력하세요.");
//		String msg = scanner.nextLine();
//		
//		/*msg = msg.toLowerCase();//대소문자 구분없이 이용하기 위함.*/
//		
//		if(msg.toLowerCase().equals("qUiT"/*.toLowerCase()*/)) { //유저의 편리함 항상 생각. //양쪽 다 맞추는것 기본.
//			
//			if(scanner!=null) {
//				scanner.close();
//				scanner = null;
//			}
//			
//			System.out.println("App 종료합니다..");
//				return;
//			}
		
		
		
//		System.out.println("학생이름 국어 영어 수학 점수 입력");
//		System.out.println("ex)홍길동 90 90 90");
		
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();// 없을 시 맨 뒤 엔터가 읽어짐.
		
		
		double sum = kor+eng+math;
		double avg = sum/3;
		
		System.out.printf("%n이름: %s %n",name);
		System.out.printf("국어: %d 영어: %d 수학: %d ",kor,eng,math);
		System.out.printf("평균: %.2f %n%n",avg);
		
		char grade = 'F';
		
//		//학점 처리 A B C D F
//		if(avg >=90) {
//			grade = 'A';
//		}else if(avg >=80) {
//			grade = 'B';
//		}else if(avg >=70) {
//			grade = 'C';
//		}else if(avg >=60) {
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}
		
		
		
		switch ((int)avg/10) {
		
		case 10:	
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
			
		case 7:
			grade = 'C';
			break;
			
		case 6:
			grade = 'D';
			break;
			
			
		default:
			grade = 'F';
			break;//생략가능
		}		
		
		System.out.printf("grade = %c 학점%n",grade);
		
		switch (grade) {
		case 'A':
			System.out.println("수석");
			
			break;
		case 'B':
			System.out.println("좀하심");
			
			break;
		case 'C':
			System.out.println("출석은하셨네");
			
			break;
		case 'D':
			System.out.println("좀하지..");
			
			break;

		default:
			System.out.println("재수강");
			break;
		}
		
		
		
		
		
		
//		if(avg >=80) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
		
		if(scanner != null) scanner.close();
		scanner = null;
		return;
	}

}
