package day03;

public class prob {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum += j;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
