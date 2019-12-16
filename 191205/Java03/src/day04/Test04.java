package day04;

public class Test04 {

	public static void main(String[] args) {
			
			int[] eng;//배열 선언
			eng = new int[5];//배열 생성 -> 메모리에 연속적인 공간에 할당이 된다.
			
			//배열이 default 0으로 초기화 된다.
			
			
			
			
			eng[0] = 99;
			eng[1] = 88;
			eng[2] = 100;
			eng[3] = 81;
			eng[4] = 67;
			
			double sum=0;
			double avg=0.0;
			
			for(int i=0; i<eng.length;i++) {
				System.out.print(eng[i]+" \n");
				sum +=eng[i];
				
			}
			avg = sum/eng.length;
			
			System.out.printf("합계 = %d \n",(int)sum);
			System.out.printf("평균 = %.2f \n",avg);
			
			
			String[] names = new String[5]; //배열은 자동으로 초기화. String(참조형)인 경우 null로 초기화 된다.
			
			names[0] = "김길동";
			names[1] = "";
			names[2] = "이길동";
			names[3] = "최길동";
			names[4] = "고길동";

			
			for(int i = 0; i<names.length; i++) {
				
				if(names[i] != null&&names[i].length()>0) // null 체크를 먼저해야 오류가 생기지 않는다. 앞이 false면 뒤에를 처리하지 않기 때문.
				System.out.print(names[i].charAt(0)+"** ");
				System.out.print("영어점수: "+eng[i]);
				if(eng[i]<avg) {
					System.out.println(" =>평균이하");
				}else {
					System.out.println();
					}
				
				
			
			}			
			
					
		}
		
	}


