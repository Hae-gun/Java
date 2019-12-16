package report;

public class Student extends Person{
	private int id;

	public Student() {
		super();
	}

	public Student(String name,int age,int id) {
		super(name,age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void print() {
		System.out.printf("[�̸�:%s  ����:%d  �й�:%d]%n",getName(),getAge(),getId());
	}
	
}
