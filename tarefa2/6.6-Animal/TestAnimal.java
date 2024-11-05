

public class TestAnimal {

	public static void main(String[] args) {
		
		Cat g1 = new Cat("Bolinha");
		System.out.println("Gato: ");
		g1.greets();
		 
		Dog d1 = new Dog("Jack");
		Dog d2 = new Dog("Teddy");
		System.out.println("Cachorro: ");
		d1.greets();
		d1.greets(d2);
		
		BigDog d3 = new BigDog("Jack");
		BigDog d4 = new BigDog("Teddy");
		System.out.println("Cachorro grande: ");
		d3.greets();
		d3.greets(d2);
		d3.greets(d4);
	}

}
