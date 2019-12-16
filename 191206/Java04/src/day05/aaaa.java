package day05;
import java.util.*;
public class aaaa {
	public static void main(String args[]) {
		
		
		System.out.println( Prob5.leftPad("SDS", 6, '#') );
		System.out.println( Prob5.leftPad("SDS", 5, '$') ); 
		System.out.println( Prob5.leftPad("SDS", 2, '&') ); 
		
		
		
	}
	
	
	
	public static String leftPad(String str, int size, char padChar) {
		
		StringBuilder result = new StringBuilder();
			
			
		for(int i=0; result.length()<size-str.length();i++) {
			result.append(padChar);
		}
		
		result.append(str);
		return result.toString();
		
	}
}  