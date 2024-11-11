
public class Movel {

	private String name;
	private double tamanho;
	
	public Movel(String name, double tamanho) {
		this.name = name;
		this.tamanho = tamanho;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	

	@Override
	public String toString() {
		return "Movel [name=" + name + ", tamanho=" + tamanho + "]";
	}
	
	
	
}
