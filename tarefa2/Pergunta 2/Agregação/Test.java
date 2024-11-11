
public class Test {

	public static void main(String[] args) {
		
		Movel m1 = new Movel("Televisao", 10.0);
		Movel m2 = new Movel("Sofa", 50.0);
		
		Comodo c1 = new Comodo("Sala de Estar");
		
		c1.adicionarMovel(m1);
		c1.adicionarMovel(m2);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(c1);
	}

}
