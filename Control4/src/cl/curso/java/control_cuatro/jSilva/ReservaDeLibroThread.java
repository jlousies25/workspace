package cl.curso.java.control_cuatro.jSilva;

public class ReservaDeLibroThread extends Thread {

	private Libro[] libro;

	public ReservaDeLibroThread() {

	}

	public ReservaDeLibroThread(Libro[] libro) {
		super();
		this.libro = libro;
	}

	public Libro[] getLibro() {
		return libro;
	}

	public void setLibro(Libro[] libro) {
		this.libro = libro;
	}
	
	
	
	
}
