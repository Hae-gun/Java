package App;

import java.util.Scanner;

public class myApp {

	public static void main(String[] args) {

		boolean exit=false;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		while(!exit) {
			
			String mNum= " ";
			System.out.printf("���ϴ� �޴� ��ȣ�� �Է��ϼ���..%n");
			System.out.printf("%n1. ��     ��%n");
			System.out.printf("%n2. ��     ��%n");
			System.out.printf("%n3. ��     ��%n");
			System.out.printf("%n4. ��     ��%n");
			System.out.printf("%n5. ��Ϻ���%n");
			System.out.printf("%n9. ��     ��%n");
			System.out.printf(":");
			
			mNum = scanner.nextLine().trim();
			
			switch(mNum) {
				
				case "1":
					
					System.out.println("�Է� �۾� ����");
					
					break;
					
				case "2":

					System.out.println("���� �۾� ����");
					
					break;
					
				case "3":
					
					System.out.println("���� �۾� ����");
					
					break;
					
				case "4":
					
					System.out.println("�˻� �۾� ����");
					
					break;
					
				case "5":
					
					System.out.println("��Ϻ��� �۾� ����");
					
					break;
					
				case "9":
					
					System.out.println("���� �����ұ��?(yes)");
					
					String y = scanner.nextLine();
					
					
					if(y.equalsIgnoreCase("yes")) {	//��ҹ��� ���� x				
					
						exit = !exit;
						if(scanner!=null) scanner.close();
						scanner = null;
					
					}
					else
						break;
				
				default:
					System.out.printf("%n�߸��� ��ȣ�Դϴ�.%n");
					
					break;
			
			}
			
			
		}
		
		System.out.println("���α׷��� �����մϴ�..");
			
		
	}

}
