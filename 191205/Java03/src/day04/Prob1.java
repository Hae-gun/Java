package day04;
import java.util.*;
import java.lang.reflect.Array;


public class Prob1 {

	public static void main(String[] args) {
		
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		String[] chgData = new String[strData.length];
		
		
		
		for(int i = 0; i<strData.length; i++) {
			
			chgData[i] = "";
			
			for(int j=strData[i].length()-1; j>=0;j--) {
				chgData[i] += strData[i].charAt(j);
			}
			
			
			
		}
		System.out.println(Arrays.toString(strData));
		System.out.println(Arrays.toString(chgData));
		
	
	}

}
