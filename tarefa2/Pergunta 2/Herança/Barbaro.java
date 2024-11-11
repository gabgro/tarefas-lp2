
public class Barbaro extends RPGClass{

	@Override
	public void usarHabilidade(double vida) {
		super.setVida(super.getVida() - vida);
	}
	
}
