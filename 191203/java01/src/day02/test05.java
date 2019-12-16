package day02;

public class test05 {

	public static void main(String[] args) {
		byte num = 127;
		
		num = (byte) (num + 1);
		
		System.out.println(num);//-128
		
		char c = '9';
		System.out.printf("숫자? %b %n",Character.isDigit(c));
		
		
		System.out.println("abc" + "def");//abcdef
		System.out.println(1+1+1);//3
		System.out.println(1+1+"1");//21
		System.out.println("1"+1+1);//111
		//String +연산은 성능저하의 원인. 가급적 사용하지 말것.
		
		String r1 = "100"+1;
		int r2 = Integer.parseInt("100")+1;//자주 쓸것.
		System.out.printf("r1 = %s, r2 =  %d %n" ,r1,r2);
		
		double r3 = Double.parseDouble("100.5");
		System.out.println(r3);
		
		int r4 =(int) (Double.parseDouble("100.5")+1);
		System.out.println(r4);
		
		System.out.println(Math.PI);
	}

}
