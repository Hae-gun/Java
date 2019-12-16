package day07;

public class Fish extends Animal{
	String name;
	public Fish() {
		super("¸ô°í±â");
	}



	public Fish(String name) {
		super("¸ô°í±â");
		this.name = name;
	}



	public void print(){
		System.out.printf("[%s, %s]%n",kind,name);
		
	}
	
	@Override
	public void breath() {
		System.out.println("¾Æ°¡¹Ì·Î ¼û½¬±â...");
		
	}
	
	
}
