package day07;

public class Test05 {
	public static void main(String[] args) {
		
		Dog[] d;
		Fish[] f;
		Animal[] animals = {
				 new Dog("������","ĳ��"),
				 new Fish("����"),
				 new Fish("����"),
				 new Dog("�ú������㽺Ű","����")
		};
		
		for(Animal data : animals) {
			if(data instanceof Dog) ((Dog)data).print();
			if(data instanceof Fish) ((Fish)data).print();
			data.breath();
		}
		
		
		
		
	}

}
