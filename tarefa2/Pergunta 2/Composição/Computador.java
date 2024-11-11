
public class Computador {

	private String monitor;
	private CPU cpu;
	
	public Computador(String monitor, String placaMae, String placaVideo, String processador) {
		this.monitor = monitor;
		this.cpu = new CPU(placaMae, placaVideo, processador);
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	

	@Override
	public String toString() {
		return "computador [monitor=" + monitor + ", cpu=" + cpu + "]";
	}
	
	
	
}
