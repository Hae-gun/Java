package day04;

public class Test03_9x9 {

	public static void main(String[] args) {
		
		
		A: for(int i=1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				
				//if(j==5) break; //j==5�϶� ���Ե� ���� Ż��.
				
				//if(j==5) continue; //j==5�� ���� ó��. �Ʒ� �����ϰ� �ٽ� ���� ����(������).
				if(j==5) break A; //�󺧸� �۾�.
				
				
				
				int result = i*j;
				System.out.printf("%2d*%2d= %2d| ",j,i,result);
			}
			System.out.println();
			
			
			
		}
		
		
		
	}

}
