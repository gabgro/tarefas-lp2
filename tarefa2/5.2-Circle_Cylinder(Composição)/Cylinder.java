

public class Cylinder{
	
	private Circle base;
	private double height;
	
	public Cylinder() {
		base = new Circle();
		height = 1.0;
	}
	
	//Outros construtores para o TestCylinder do exercício anterior funcionar com o exemplo de composição também
	public Cylinder(double height) {
		base = new Circle();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		base = new Circle(radius);
		this.height = height;
	}

	public double getRadius() {
		return base.getRadius();
	}
	
	public void setRadius(double radius) {
		base.setRadius(radius);
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return base.getArea()*height;
	}
	
	public double getArea() {
		return base.getCircumference()*this.height + 2*base.getArea();
	}
	
	public String toString() {
		return "Cylinder: subclass of " + base.toString() + " height=" + this.height;
	}
	
}
