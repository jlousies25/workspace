package cl.curso.java.prueba_dos.josesilva;

public class Curso extends Alumno {
	
	private String nombre;
	private Alumno alumno;
	
	public Curso (){
		
		this.nombre = "4G";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
		
}
