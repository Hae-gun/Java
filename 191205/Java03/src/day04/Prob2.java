package day04;
import java.util.*;
public class Prob2 {

	public static void main(String[] args) {
		
		int[] i = new int[1];
		
		
		boolean end = false;
		int sum=0;	
		int count = 1;
		
		while(!end) {
			
			
		
			for(int j=0;j<i.length;j++) {
				
				if(j%2!=0) i[j]=-count;
				else i[j] = count;
			
				sum += i[j];
				
				
			}
			System.out.print(i[count-1]+" ");
			
			count++;
					
			if(sum!=100) {
				int[] temp = new int[i.length+1];
				i=temp;
				
			}else if(sum==100) { 
				break;
				}
			
		}
		
		System.out.print(" = "+sum);
		
	}

}
