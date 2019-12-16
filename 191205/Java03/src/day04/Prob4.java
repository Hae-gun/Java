package day04;

public class Prob4 {

	public static void main(String[] args) {
		
			int[] arr = {10, 20, 30, 40, 50}; 
			int sum = 0;
			int count=0;
			// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
			R: while(true) {
				
				sum += arr[count];
				count++;
				
				if(count==arr.length) break R;
			}
			
			
			System.out.println("sum ="+sum);

	}

}
