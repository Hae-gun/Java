package day04;

public class Test03_9x9 {

	public static void main(String[] args) {
		
		
		A: for(int i=1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				
				//if(j==5) break; //j==5일때 포함된 루프 탈출.
				
				//if(j==5) continue; //j==5만 빼고 처리. 아래 무시하고 다시 루프 진행(재진입).
				if(j==5) break A; //라벨링 작업.
				
				
				
				int result = i*j;
				System.out.printf("%2d*%2d= %2d| ",j,i,result);
			}
			System.out.println();
			
			
			
		}
		
		
		
	}

}
