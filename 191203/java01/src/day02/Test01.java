package day02;

public class Test01 {
	
	// 클래스의 구성요소
	// Data(변수, 멤버변수) 	+	 기능(함수 = method)
	
	
	public static void main(String[] args) {
		// Data(변수) , 지역변수, 초기화 해야 사용 가능.
		
		//기본형
		int i = 900;
		long i2 = 99999999999l;
		
		double f = 99.9;
		float f2 = (float)f;
		
		char c = 'A';//ASKI 코드도 함께 저장됨.
		
		//형변환 프로모션 char => int
		int c2 = c;	
		
		int c3 = 97;
		
		//형변환 casting int => char
		char c4 = (char)c3;
		
		
		System.out.println(c); //'A'
		System.out.println(c2); //65
		System.out.println(c4); //65
		System.out.println("=================="); 
		System.out.printf("1/2 = %d %n", 1/2);
		System.out.printf("1/2 = %.2f %n", 1/2.);
		System.out.println("=================="); 
		
		
		boolean b = true;
		
		
//		System.out.printf("%d %f %c %b %n",i,f,c,b);
//		System.out.printf("%s %s %s %s %n",i,f,c,b);// java에서 모든 데이터는 string화 가능하다.
//		System.out.printf("i=%d f=%.2f c=%c b=%b %n",i,f,c,b);
//		
//		//참조형
//		String name = "홍길동"; //reference 주소가 들어감. dot 연산자 사용가능.
//		System.out.println(name);

	}

}
