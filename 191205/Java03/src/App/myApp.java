package App;

import java.util.Scanner;

public class myApp {

	public static void main(String[] args) {

		boolean exit=false;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		while(!exit) {
			
			String mNum= " ";
			System.out.printf("원하는 메뉴 번호를 입력하세요..%n");
			System.out.printf("%n1. 입     력%n");
			System.out.printf("%n2. 수     정%n");
			System.out.printf("%n3. 삭     제%n");
			System.out.printf("%n4. 검     색%n");
			System.out.printf("%n5. 목록보기%n");
			System.out.printf("%n9. 종     료%n");
			System.out.printf(":");
			
			mNum = scanner.nextLine().trim();
			
			switch(mNum) {
				
				case "1":
					
					System.out.println("입력 작업 수행");
					
					break;
					
				case "2":

					System.out.println("수정 작업 수행");
					
					break;
					
				case "3":
					
					System.out.println("삭제 작업 수행");
					
					break;
					
				case "4":
					
					System.out.println("검색 작업 수행");
					
					break;
					
				case "5":
					
					System.out.println("목록보기 작업 수행");
					
					break;
					
				case "9":
					
					System.out.println("정말 종료할까요?(yes)");
					
					String y = scanner.nextLine();
					
					
					if(y.equalsIgnoreCase("yes")) {	//대소문자 구분 x				
					
						exit = !exit;
						if(scanner!=null) scanner.close();
						scanner = null;
					
					}
					else
						break;
				
				default:
					System.out.printf("%n잘못된 번호입니다.%n");
					
					break;
			
			}
			
			
		}
		
		System.out.println("프로그램을 종료합니다..");
			
		
	}

}
