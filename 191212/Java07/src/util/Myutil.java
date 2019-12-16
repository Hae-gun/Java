package util;

import java.util.*;
import java.util.List;

public class Myutil {
	
	
	public static void iteratorPrint(List<String> list) {
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String data = (String)it.next();
			System.out.print(data+" ");
			
		}
		
	}
	public static void iteratorPrint(Set<String> set) {
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String data = (String)it.next();
			System.out.print(data+" ");
			
		}
		
	}
	
	
}
