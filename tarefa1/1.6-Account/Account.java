public class Account {

	private String ID;
	private String name;
	private int balance;
	
	// Primeiro Construtor
	public Account(String ID, String name) {
		this.ID = ID;
		this.name = name;
		balance = 0;
	}
	
	// Segundo Construtor
	public Account(String ID, String name, int balance) {
		this.ID = ID;
		this.name = name;
		this.balance = balance;
	}
	
	//getters
	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	//debito, crédito e transferência
	public int credit(int amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}
	
	public int debit(int amount) {
		if(amount <= this.balance) {
			this.balance = this.balance - amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
	
	public int transferTo(Account another, int amount) {
		if(amount <= this.balance) {
			this.balance = this.balance - amount;
			another.credit(amount);
		}else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
	
	// toString
	public String toString() {
		return "Account[id=" + this.ID + ",name=" + this.name + ",balance=" + this.balance + "]";
	}
	
}
