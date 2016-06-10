package cl.curso.java.control_cuatro.jSilva;

public class Libro {
	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados[];
	
	public Libro() {
		this.nombre = "Papelucho";
		this.editorial = "Lo que sea";
		this.cantidadLibros =50;
		this.cantidadLibrosPrestados = null;
			}

	public Libro(String nombre, String editorial, int cantidadLibros, int[] cantidadLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getCantidadLibros() {
		return cantidadLibros;
	}

	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	public int[] getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	public void setCantidadLibrosPrestados(int[] cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}
	
	public void reservarLibro (){
		for (int i = 0; i < cantidadLibrosPrestados.length; i++) {
			this.cantidadLibros = this.cantidadLibros - 1;
			
		}
		
		
	}
	
	



	
	
}
