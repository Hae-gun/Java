package day05;



public class test05 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "ȫ�浿";
		emp1.dept = "�����";
		emp1.age = 32;
		
		Employee emp2 = new Employee();

		emp2.name = "��浿";
		emp2.dept = "������";
		emp2.age = 29;
		
		
		Employee emp3 = emp1;
		
		emp1.print();
		emp2.print();
		emp3.print();
	
		Employee[] employees = new Employee[3];
		
		
		
	}

}



//������Ʈ, �ν��Ͻ�ȭ �Ѵ�. ��ü�����Ѵ�. ������

class Employee{ //public �Ⱥ��̸� ���� package������ ��� ����. public ���̸� �ٸ� package������ ��� ����.
	
	String name; //��� variable
	String dept;
	int age;
	
//		public Employee(){
//			this.name = "����";
//			this.dept = "����";
//			this.age = 10;
//		}
	
	public void print() {
		System.out.printf("[%s, %s, %d]%n",this.name,this.dept,this.age);
		return;
	}
	
}