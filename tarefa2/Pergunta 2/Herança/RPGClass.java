
public class RPGClass {

	private double vida;
	private double mana;
	
	public RPGClass() {
		vida = 100.0;
		mana = 100.0;		
	}
	
	public RPGClass(double vida, double mana) {
		this.vida = vida;
		this.mana = mana;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getMana() {
		return mana;
	}

	public void setMana(double mana) {
		this.mana = mana;
	}
	
	public void usarHabilidade(double mana) {
		this.mana = this.mana - mana;
		
	}
	
	public String toString() {
		   return "Status[vida=" + this.vida + " mana=" + this.mana + "]";
		}
	
}
