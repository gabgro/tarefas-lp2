

public class BigDog extends Dog{
	
	public BigDog(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Wooow");
	}
	
	@Override
	public void greets(Dog Another) {
		System.out.println("Woooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Wooooooooow");
	}
	
}
