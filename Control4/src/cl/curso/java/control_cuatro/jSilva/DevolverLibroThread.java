package cl.curso.java.control_cuatro.jSilva;

public class DevolverLibroThread extends Thread {
	
	private Libro libro;

	public DevolverLibroThread (){}
	
	public DevolverLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	

}
