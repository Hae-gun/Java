package day07;

public class Dog extends Animal {
	String kind = "������ ����";
	String name;

	public String getSuperKind() {
		return super.kind;
	}
	
	public Dog() {
		super("������"); 
	}//�ڵ����� ��. �θ𿡼� �������� ������ ����.
	
	
	public Dog(String kind, String name) {
		super("������");
//		super.kind = "������"; �ǹ� ������.
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		System.out.printf("[%s, %s, %s]%n", 
				super.kind, this.kind, this.name);
	}
}