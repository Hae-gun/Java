package day10;

import java.util.*;


public class Test07 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("java01","1234");
		map.put("java02","1234");
		map.put("java03","1234");
		map.put("java04","1234");
		map.put("java05","1234");
		map.put("java06","1234");
		map.put("java07","1234");
		map.put("java08","1234");
		map.put("java09","1234");
		map.put("java01","4321");
		
		//map ���� ��ȸ
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String id = (String)it.next();
			System.out.println(id+" = "+map.get(id));
			
		}
		
		//�α��� ó��
		it = keys.iterator();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID �Է�");
			String ID = scanner.nextLine().trim();
			System.out.println("PW �Է�");
			String PW = scanner.nextLine().trim();
			
			
			if(!map.containsKey(ID)) {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
				continue;
			}else {
				
				
				if(map.get(ID).equalsIgnoreCase(PW)) {
					System.out.println("�α��� ����");
				break;
				}else {
					System.out.println("�α��� ����. ��й�ȣ Ȯ��");
					}
			}
		}
		
		
		
		
		scanner.close();
		scanner = null;
		
		System.out.println("END");
		
		
		
	}

}
