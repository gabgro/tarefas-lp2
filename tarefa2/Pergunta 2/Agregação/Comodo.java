
import java.util.ArrayList;

public class Comodo {

	private String name;
	private ArrayList <Movel> moveis;
	
	public Comodo(String name) {
		this.name = name;
		this.moveis = new ArrayList();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void adicionarMovel(Movel movel) {
		moveis.add(movel);
	}

	@Override
	public String toString() {
		return "Comodo [name=" + name + ", moveis=" + moveis + "]";
	}
	
	
	
	
}
