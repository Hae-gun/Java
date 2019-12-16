package day05;

public class test04 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for(int data :num) {// enhanced for loop
			if(data%2==0)System.out.print(data+" ");
		}
		
		char[] c = "AbCd".toCharArray();
		
		for(char data: c) {
			if(data>'A'&&data<'Z') System.out.println(data+" ");
		}

		String[] s = {"hello", "java", "test"};
	
		for(String data: s) {
			if(data.charAt(0)=='j')System.out.println(data);
		}
	}

}
