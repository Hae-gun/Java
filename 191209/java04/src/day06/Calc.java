package day06;

public class Calc {
	//메소드 오버로딩 동일한 이름의 메소드 가능 단 파라미터의 갯수나 타입이 다를 때 허용
	
	public static int add(int a, int b){ //접근지정자 + 리턴타입(모든값 다 사용가능) + 메소드 네임 + (매개변수리스트):메소드 선언부 
		return a+b; 
	}//메소드 구현부(바디) 리턴값 표시.
	
	public static double add(double a, double b){   
		return a+b; 
	}
	
	public static int add(int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8,int a9,int a10,) {\
		return a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
	}
	
	//static 영역 안에서는 this, super 사용 불가능.
}
