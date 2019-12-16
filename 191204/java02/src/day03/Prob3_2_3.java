package day03;

public class Prob3_2_3 {

	public static void main(String[] args) {

		int sum = 0;
		
		System.out.print("1~20 숫자중 2또는 3의 배수가 아닌 수: ");

		for(int i=1; i<=20;i++){
			if((i%2!=0)&&(i%3!=0)){
				sum += i;
				System.out.print(i+" ");
			}			
		}
		
		System.out.println();
		System.out.println("sum= "+sum);
	}

}
