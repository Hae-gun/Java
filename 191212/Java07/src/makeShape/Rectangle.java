package makeShape;

public class Rectangle extends Shape {

	private double width; // �ʺ�
	private double hight; // ����

	public Rectangle() {
		super();
	}

	public Rectangle(String name, double width, double hight) {
		super.setName(name);
		this.width = width;
		this.hight = hight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	@Override
	void calculationArea() {
		// TODO Auto-generated method stub
		super.setArea(this.getHight() * this.getWidth());
		return;

	}

	@Override
	public void print() {
		System.out.printf("���簢���� �� ������ %.1f %n", super.getArea());
	}

}
