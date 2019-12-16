package day05;



public class test05 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "홍길동";
		emp1.dept = "기술부";
		emp1.age = 32;
		
		Employee emp2 = new Employee();

		emp2.name = "고길동";
		emp2.dept = "교육부";
		emp2.age = 29;
		
		
		Employee emp3 = emp1;
		
		emp1.print();
		emp2.print();
		emp3.print();
	
		Employee[] employees = new Employee[3];
		
		
		
	}

}



//오브젝트, 인스턴스화 한다. 객체생성한다. 같은말

class Employee{ //public 안붙이면 같은 package에서만 사용 가능. public 붙이면 다른 package에서도 사용 가능.
	
	String name; //멤버 variable
	String dept;
	int age;
	
//		public Employee(){
//			this.name = "없음";
//			this.dept = "없음";
//			this.age = 10;
//		}
	
	public void print() {
		System.out.printf("[%s, %s, %d]%n",this.name,this.dept,this.age);
		return;
	}
	
}