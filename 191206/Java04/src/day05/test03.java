package day05;

import java.util.Arrays;

public class test03 {

	public static void main(String[] args) {
//		System.out.println(args.length); //args 비어있는 배열. run time 입력시 넘겨받는 통로.
//		System.out.println(Arrays.toString(args));
//		
//		
//		
//		if(args.length==0) {
//			System.out.println("파라미터가 없습니다.");
//			return;
//		}
//		System.out.println(args[0].charAt(0)+"**");
	
		
		
		int[] num =new int[] {1,2,10,7,3};//분리하어 선언할때.
		int[] num2 = num; //주소를 가져옴
		int[] num3 = num.clone();// 값을 가져옴
		
		num2[2] = 99;
		
		Arrays.sort(num3);;//중급 수준에선 Java API사용 허용. 고급에선 직접 만듬
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));
		
		
		String url = "http://myweb/admin/login.do";
		char[] s = url.toCharArray();
		
		
		
		
		System.out.println(url.substring(url.lastIndexOf('/')));
		
		
		}
}
