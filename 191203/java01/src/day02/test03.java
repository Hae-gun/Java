package day02;

public class test03 {
		
	public static void main(String[] args) {
		
		int pw= 0;
		
		System.out.println(pw);
		pw = "  hello1234 ".trim().length();//method chaining
		pw = "  hello1234 ".trim().toUpperCase().length();
		System.out.println(pw);
		System.out.println(pw>8);
		pw = 0;
		System.out.println("---------------------------");
		
		String msg = null;
		System.out.println(msg);
		msg = "hello java ~~~";
		System.out.println(msg);
		String msg2 = msg;
		
		msg = null;//다 쓴 후 null로 만들어 메모리 누수가 안생김
		msg2 = null;
		
	}	
		
}		
