package day07;

public class Test02 {
	public static void main(String[] args) {
		//is a ����
        // ��� ��ü�� ������ Ÿ���� �θ� �ɼ� �ִ�. .
        //�ʿ��ϸ� upcasting downcasting�� ���� �Ѵ�. 
		Object a = new Animal();
        ((Animal)a).breath();
        
		Animal a2 = new Animal();
		a2.breath();
		
		Object obj = a2;
		Animal temp = (Animal)obj;
		temp.breath();
		
		Dog d = new Dog();
		
		System.out.println(d.kind);
		Object obj2 = d;
		Animal a3 = (Animal)obj2;
		Dog d3 = (Dog)obj2;
		
		System.out.println(a3.kind);
		System.out.println(d3.kind);
		
		System.out.println("========================================");
		
		String msg = "hello java";
		
		Object obj7 =d;
		
		if(obj7 instanceof Dog) // Ÿ�� Ȯ��.
			System.out.println(((Dog)obj7).kind);
		
		if(obj7 instanceof Animal) // Ÿ�� Ȯ��.
			System.out.println(((Animal)obj7).kind);
		
		if(obj7 instanceof String) // Ÿ�� Ȯ��.
			System.out.println(((String)obj7).toUpperCase());
	}
}
