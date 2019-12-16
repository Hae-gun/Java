package day10;

public class Test02 {

	public static void main(String[] args) {
	
//		Employee2<String,String> emp1 = new Employee2<String,String>("ȫ�浿","2019001");
//		System.out.println(emp1);

		Employee2<String,Integer> emp2 = new Employee2<String,Integer>("ȫ�浿",2019001); //intŸ���� Integer�� �ٲ� BOXING
		System.out.println(emp2.number/1000);
	
		Employee2<String,Double> emp3 = new Employee2<String,Double>("ȫ�浿",2019001.0);
		System.out.println(emp3.number/1000);
		
		Employee2 emp4 = new Employee2("��浿",201701);
		System.out.println(emp4);
		System.out.println(emp4.number.getClass());
		System.out.println(emp4.name);
		
	}

}

class Employee2<T,P extends Number>{ //�������� extends ����� ���� Ÿ�Ը���.
	
	T	name;
	P	number;
	
	public Employee2(T name, P number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", number=" + number + "]";
	}
	
}
