package day10;

import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Iterator;
import util.Myutil;
public class Test04 {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<String>();//AWP List-> GUI    Generics ���ϸ� default Object
		List<String> list = new Vector<String>();// ArrayList�� ���� ����ϳ� ��¦ �ٸ���.
		
		System.out.println(list.size());
		list.add("ȫ�浿");
		list.add("��浿");
		list.add("�̱浿");
		list.add("���浿");
		list.add("���浿");
		list.add("�߱浿");
//		list.add("ȫ�浿");
		
		System.out.println(list.size());
		
		System.out.println("-----for |  ��ȸ----------"); //set������ for loop �Ұ���.
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("��浿? "+ list.contains("ȫ�浿"));

		
		System.out.println("-----Iterator ��� ��ȸ----------");
		Myutil.iteratorPrint(list);
		System.out.println();
		
		/*String rname = JOptionPane.showInputDialog("������ �̸� �Է�");
		it = list.iterator(); //�ٽ� �Ҵ� �޾ƾ���
		
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
