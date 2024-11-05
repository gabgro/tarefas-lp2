

public class Circle {
	
	//Variável privada, não está disponível fora da classe 
	private double radius;
	private String color;
	
	//Método construtor, constrói uma instância de Circle com valores padrões para radius e color
	public Circle() {/** Primeiro construtor(padrão) */
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double radius) {/** Segundo construtor */
		this.radius = radius;
		color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*radius*Math.PI;
	}
	
	// Retorna o radius e o color de circle na forma Circle[radius=?,color=?] 
	public String toString() {
	   return "Circle[radius=" + radius + " color=" + color + "]";
	}

}
