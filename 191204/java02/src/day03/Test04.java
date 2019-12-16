package day03;
import java.util.*;

public class Test04 { //class name 대문자로.
	
	public static void main(String[] args) {
		
		/*String studentName; //변수 메소드 name 소문자 시작. 카멜기호법 이용*/
		System.out.println("App 시작...");
		String name = null;
		int kor=0,eng=0,math=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적처리를 종료하려면 quit를 입력하세요.");
		String msg = scanner.nextLine();
		
		/*msg = msg.toLowerCase();//대소문자 구분없이 이용하기 위함.*/
		
		if(msg.toLowerCase().equals("qUiT"/*.toLowerCase()*/)) { //유저의 편리함 항상 생각. //양쪽 다 맞추는것 기본.
			
			if(scanner!=null) {
				scanner.close();
				scanner = null;
			}
			
			System.out.println("App 종료합니다..");
				return;
			}
		
		
		
		System.out.println("학생이름 국어 영어 수학 점수 입력");
		System.out.println("ex)홍길동 90 90 90");
		
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();
		
		
		double sum = kor+eng+math;
		double avg = sum/3;

		System.out.printf("%n이름: %s %n",name);
		System.out.printf("국어: %d 영어: %d 수학: %d ",kor,eng,math);
		System.out.printf("평균: %.2f %n%n%n",avg);
		
		if(avg >=80) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
		scanner = null;
		return;
	}

}
