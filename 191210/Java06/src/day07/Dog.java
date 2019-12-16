package day07;

public class Dog extends Animal {
	String kind = "강아지 종류";
	String name;

	public String getSuperKind() {
		return super.kind;
	}
	
	public Dog() {
		super("강아지"); 
	}//자동으로 들어감. 부모에서 없어지면 지워도 에러.
	
	
	public Dog(String kind, String name) {
		super("강아지");
//		super.kind = "강아지"; 의미 없어짐.
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		System.out.printf("[%s, %s, %s]%n", 
				super.kind, this.kind, this.name);
	}
}
