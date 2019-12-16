package day05;

import java.util.Arrays;

public class test01_sort {

	public static void main(String[] args) {
			
			int size = 5;
		
			if(args.length != 0) {
				size = Integer.parseInt(args[0]);
			}
			int[] num = new int[size];
			
			for(int i=0; i<num.length; i++){
				num[i] = (int)(Math.random()*100)+1;
				for(int j=0; j<i; j++) {
					if(num[i]==num[j]) {
						i--;
						break;
					}
				}
				
			}
			System.out.println(Arrays.toString(num));
			
		
//			for(int i=0; i<num.length; i++) {
//				int temp=0;
//				
//				for(int j=0; j<num.length-1; j++) {
//					
//					if(num[i]<num[j]) {
//						temp = num[i];
//						num[i] = num[j];
//						num[j] = temp;
//					}
//				}
//			}
//			
//			System.out.println(Arrays.toString(num));
			
			for(int i=0; i<num.length-1; i++) {
				int min = i;
				
				for(int j=i+1; j<num.length;j++) {
					if(num[min]>num[j]) {
						min = j;
					}
				}
				
				if(i!=min) {
					int temp = num[i];
					num[i] = num[min];
					num[min] = temp;
				}
			}
			
//			Arrays.sort(num);
			System.out.println(Arrays.toString(num));
			
		
	}

}
