
public class Asiento{
	
	private boolean reservado; 

	public Asiento(boolean reservado) {
		super();reservado = reservado;
	}
	
	public Asiento(){
		this.reservado =false;
	}

	public boolean isAsiento() {
		return reservado;
	}

	public void setAsiento(boolean reservado) {
		this.reservado = reservado;
	}
	
	

}
