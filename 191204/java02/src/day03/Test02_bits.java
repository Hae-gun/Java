package day03;

public class Test02_bits {

	public static void main(String[] args) {
	
		System.out.println(1<<0);
		System.out.println(1<<1);
		System.out.println(1<<2);
		System.out.println(1<<3);
	
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(1>4 & 4<0);
		System.out.println(1&4);//비트연산으로 실행됨. 0 0000
		System.out.println(1|4);//5 0101
	}

}
