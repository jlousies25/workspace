package cl.curso.java.prueba_tres.jsilva;

public class PagarViaje extends Thread{

	private TarjetaBip tarjetaBip;
	private int valorViaje;
	
	public PagarViaje() {
		super();
	}

	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}

	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}

	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
	}

	public int getValorViaje() {
		return valorViaje;
	}	
	
	
	@Override
	public void run() {
		
	}
	
}
