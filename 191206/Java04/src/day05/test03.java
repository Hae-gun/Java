package day05;

import java.util.Arrays;

public class test03 {

	public static void main(String[] args) {
//		System.out.println(args.length); //args ����ִ� �迭. run time �Է½� �Ѱܹ޴� ���.
//		System.out.println(Arrays.toString(args));
//		
//		
//		
//		if(args.length==0) {
//			System.out.println("�Ķ���Ͱ� �����ϴ�.");
//			return;
//		}
//		System.out.println(args[0].charAt(0)+"**");
	
		
		
		int[] num =new int[] {1,2,10,7,3};//�и��Ͼ� �����Ҷ�.
		int[] num2 = num; //�ּҸ� ������
		int[] num3 = num.clone();// ���� ������
		
		num2[2] = 99;
		
		Arrays.sort(num3);;//�߱� ���ؿ��� Java API��� ���. ��޿��� ���� ����
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));
		
		
		String url = "http://myweb/admin/login.do";
		char[] s = url.toCharArray();
		
		
		
		
		System.out.println(url.substring(url.lastIndexOf('/')));
		
		
		}
}
