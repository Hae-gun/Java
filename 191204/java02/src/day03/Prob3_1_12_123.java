package day03;

public class Prob3_1_12_123 {

	public static void main(String[] args) {

		int sum = 0, sumi = 0;
		String Si="";
		for(int i=1;i<=10;i++) {
			sumi +=i;
			
			if(i==1)
			Si +=i;
			else {
				
				Si +='+';
				Si += i;
				
			}
			
			if(i!=10)
			System.out.println("("+Si+")+");
			else 
				System.out.println('('+Si+")=");
			
			sum +=sumi; 
		}
		
		System.out.println(sum);
	}

}
