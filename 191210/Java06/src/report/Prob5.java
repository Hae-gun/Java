package report;
public class Prob5 {

	public static void main(String[] args) {

		Person[] person = {
				new Student("홍길동",20,200201),
				new Employee("고길동",34,"교육부"),
				new Teacher("이순신",30,"JAVA")
		};
		
		for(Person data:person) {
			
			data.print();
		}
	
	}
	

}
