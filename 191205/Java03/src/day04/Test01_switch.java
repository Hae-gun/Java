package day04;
import java.io.FileInputStream;
import java.util.*;

public class Test01_switch { //class name �빮�ڷ�.
	
	public static void main(String[] args) throws Exception {
		
		/*String studentName; //���� �޼ҵ� name �ҹ��� ����. ī���ȣ�� �̿�*/
		System.out.println("App ����...");
		String name = null;
		int kor=0,eng=0,math=0;
		Scanner scanner = 
		new Scanner(new FileInputStream("c://lib/score.txt"),"UTF-8");

//		System.out.println("����ó���� �����Ϸ��� quit�� �Է��ϼ���.");
//		String msg = scanner.nextLine();
//		
//		/*msg = msg.toLowerCase();//��ҹ��� ���о��� �̿��ϱ� ����.*/
//		
//		if(msg.toLowerCase().equals("qUiT"/*.toLowerCase()*/)) { //������ ���� �׻� ����. //���� �� ���ߴ°� �⺻.
//			
//			if(scanner!=null) {
//				scanner.close();
//				scanner = null;
//			}
//			
//			System.out.println("App �����մϴ�..");
//				return;
//			}
		
		
		
//		System.out.println("�л��̸� ���� ���� ���� ���� �Է�");
//		System.out.println("ex)ȫ�浿 90 90 90");
		
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();// ���� �� �� �� ���Ͱ� �о���.
		
		
		double sum = kor+eng+math;
		double avg = sum/3;
		
		System.out.printf("%n�̸�: %s %n",name);
		System.out.printf("����: %d ����: %d ����: %d ",kor,eng,math);
		System.out.printf("���: %.2f %n%n",avg);
		
		char grade = 'F';
		
//		//���� ó�� A B C D F
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
			break;//��������
		}		
		
		System.out.printf("grade = %c ����%n",grade);
		
		switch (grade) {
		case 'A':
			System.out.println("����");
			
			break;
		case 'B':
			System.out.println("���Ͻ�");
			
			break;
		case 'C':
			System.out.println("�⼮���ϼ̳�");
			
			break;
		case 'D':
			System.out.println("������..");
			
			break;

		default:
			System.out.println("�����");
			break;
		}
		
		
		
		
		
		
//		if(avg >=80) {
//			System.out.println("�հ��Դϴ�.");
//		}else {
//			System.out.println("���հ��Դϴ�.");
//		}
		
		if(scanner != null) scanner.close();
		scanner = null;
		return;
	}

}
