package day04;

import java.util.*;;

public class Prob5_random_different {

	public static void main(String[] args) {

		int[] num = new int[5];
		
			for(int i=0;i<num.length;i++) {
				num[i] = (int)(Math.random()*10);
				for(int j=0;j<i;j++) {
					if(num[i]==num[j]) {
						i--;
						break;
					}
					
				}
				
			}
		
					
			for(int i=0; i<num.length; i++) {
				System.out.print(num[i]+" ");
			}
					
					
					
					
					
				
				
				
//				for(int j=0; j<num.length;j++)
//					if(i>0&&num[i]==num[j])	
//						num[i]=(int)(Math.random()*10);
					
				
				
				
				
					
					
			}
			
				
			
	}
			
	



