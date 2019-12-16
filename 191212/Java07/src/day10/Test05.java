package day10;

import java.util.*;
import util.Myutil;
public class Test05 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
//		Set<String> set = new TreeSet<String>(); //TreeSet->자동정렬
		set.add("lee");
		set.add("kim");
		set.add("park");
		set.add("choi");
		set.add("ko");
		set.add("lee");

		
		Myutil.iteratorPrint(set);
		
		
	}

}


