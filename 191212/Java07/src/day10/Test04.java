package day10;

import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Iterator;
import util.Myutil;
public class Test04 {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<String>();//AWP List-> GUI    Generics 안하면 default Object
		List<String> list = new Vector<String>();// ArrayList랑 거의 비슷하나 살짝 다르다.
		
		System.out.println(list.size());
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("진길동");
		list.add("조길동");
		list.add("추길동");
//		list.add("홍길동");
		
		System.out.println(list.size());
		
		System.out.println("-----for |  순회----------"); //set구조는 for loop 불가능.
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("김길동? "+ list.contains("홍길동"));

		
		System.out.println("-----Iterator 기반 순회----------");
		Myutil.iteratorPrint(list);
		System.out.println();
		
		/*String rname = JOptionPane.showInputDialog("삭제할 이름 입력");
		it = list.iterator(); //다시 할당 받아야함
		
		while(it.hasNext()) {
		String data = it.next();
			if(rname.equals(data)) {
				it.remove();
			}
		}*/
		
		System.out.println(list);
	
		System.out.println(list);
		list.add(2,"~~~~~~");
		System.out.println(list);
	}

}
