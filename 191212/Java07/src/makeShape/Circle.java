package makeShape;

public class Circle extends Shape {
	private double radius; // ������

	public Circle() {
	}

	public Circle(String name, double radius) {
		super.setName(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void calculationArea() {
		// TODO Auto-generated method stub
		super.setArea(this.getRadius() * this.getRadius() * Math.PI);
		return;

	}

	@Override
	public void print() {
		System.out.printf("���� ������ %.13f %n", super.getArea());
	}

}
