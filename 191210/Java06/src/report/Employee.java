package report;

public class Employee extends Person{
	private String dept;
	
	public Employee() {
		super();
	}
	
	public Employee(String name,int age,String dept) {
		super(name,age);
		setDept(dept);
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public void print() {
		System.out.printf("[이름:%s  나이:%d  부서:%s]%n",getName(),getAge(),getDept());
	}
}
