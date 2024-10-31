public class Rectangle {

	private float length;
	private float width;
	
	// Construtor Padrão
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	
	// Segundeo Construtor
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	// getters e setters
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	// Criando o método para retornar a área do retângulo
	public double getArea() {
		return this.length*this.width;
	}
	
	// Criando o método para retornar o perímetro do retângulo
	public double getPerimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public String toString() {
		return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
	}
	
}
