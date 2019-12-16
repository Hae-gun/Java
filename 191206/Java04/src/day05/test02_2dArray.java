package day05;

import java.util.Arrays;

public class test02_2dArray {

	public static void main(String[] args) {

		int[][] t1 = new int[4][3];
		
		for(int i=0; i<t1.length;i++) {
			for(int j=0;j<t1[i].length;j++) {
				System.out.printf("%2d",t1[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------");
		for(int i=0;i<t1.length;i++)
		System.out.println(Arrays.toString(t1[i]));
		
		
		System.out.println("------------------");
		
		int[][] t2 = {{1,2,3},{4,5,6,7,8,9,10},{1},{9,8,7}};
//		
		for(int i=0; i<t2.length;i++) {
			for(int j=0;j<t2[i].length;j++) {
				System.out.printf("%2d",t2[i][j]);
			}
			
			System.out.println();
		}
		System.out.println("----------------");

		char[] c = {'a','b','c','d','e'};
		System.out.println(Arrays.toString(c));
		System.out.println("-------------------------------------------------------------------------------");
		
		String a = "abcdefghijklmnopqrstuvwxyz";
		char [] aa = a.toCharArray(); //String을 char[]로 만들어주는 메소드. return값은 char.
		
		System.out.println(a);
		System.out.println(Arrays.toString(aa));
		
		
		
	} 

}
