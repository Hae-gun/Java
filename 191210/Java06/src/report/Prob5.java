package report;
public class Prob5 {

	public static void main(String[] args) {

		Person[] person = {
				new Student("ȫ�浿",20,200201),
				new Employee("��浿",34,"������"),
				new Teacher("�̼���",30,"JAVA")
		};
		
		for(Person data:person) {
			
			data.print();
		}
	
	}
	

}
