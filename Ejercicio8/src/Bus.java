
public class Bus {

	private String nombre;
	private Asiento[] asiento;
	
	
	
	
	public Bus(String nombre, Asiento[] asiento) {
		super();
		this.nombre = nombre;
		this.asiento = asiento;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Asiento[] getAsiento() {
		return asiento;
	}
	public void setAsiento(Asiento[] asiento) {
		this.asiento = asiento;
	} 
	
	public synchronized void reservarAsiento (int numeroDeAsiento){
		if(!this.getAsiento()[numeroDeAsiento].isAsiento()){
		this.getAsiento() [numeroDeAsiento].setAsiento(true);
		System.out.println("Asiento reservado con exito");
		}else{
			System.out.println("El asiento está reservado");
		}
	}
}
