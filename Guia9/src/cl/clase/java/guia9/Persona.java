package cl.clase.java.guia9;

public class Persona {

	private String nombre;
	private String apellido;
	private int telefono;

	public Persona() {
		this.nombre = "Jose";
		this.apellido = "Silva";
		this.telefono = 919191919;

	}

	public Persona(String nombre, String apellido, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		
		if (telefono <= 100000000 || telefono >= 999999999) {
			this.telefono=0;
		} else {
			this.telefono=telefono;
		}
	
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
			if (telefono <= 100000000 || telefono >= 999999999) {
				this.telefono=0;
			} else {
				this.telefono=telefono;
			}
	}

	public void imprimir() {
		System.out.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nTelefono: " + this.telefono);
	}

}
