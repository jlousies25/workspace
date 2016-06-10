
public class Semaforo {

	private EstadoSemaforo estadoSemaforo;
	
	public Semaforo(EstadoSemaforo estadoSemaforo) {
		super();
		this.estadoSemaforo = estadoSemaforo;
	}

	public EstadoSemaforo getEstadoSemaforo() {
		return estadoSemaforo;
	}

	public void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}
	
	public void cambiarColor()
	{
		this.getEstadoSemaforo().siguienteColor(this);
		System.out.println(this.getEstadoSemaforo());
	}
}