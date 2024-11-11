
public class CPU {
	
	private String placaMae;
	private String placaVideo;
	private String processador;
	
	public CPU(String placaMae, String placaVideo, String processador) {
		this.placaMae = placaMae;
		this.placaVideo = placaVideo;
		this.processador = processador;
	}

	@Override
	public String toString() {
		return "CPU [placaMae=" + placaMae + ", placaVideo=" + placaVideo + ", processador=" + processador + "]";
	}
	
}
