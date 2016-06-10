package cl.clase.java.claudio;

public class Alumno {

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String fechaNacimiento;
	private Nota[] notas;
	
	public Alumno (){
		this.nombre = "Marcelo";
		this.apellidoPaterno = "Farfan";
		this.apellidoMaterno = "Roman";
		this.fechaNacimiento = "12-23-99";
		this.notas = new Nota[1];
		notas[0] = new Nota();
		
		
	}
	
	public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, Nota[] notas) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.notas = notas;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNota(Nota[] notas) {
		this.notas = notas;
	}
	
	
	public void imprimir (){
		System.out.println(this.getNombre() +" "+ this.getApellidoPaterno() + " "+ this.getApellidoMaterno() + 
				" "+ this.getFechaNacimiento());
		
		for (int i = 0; i < notas.length; i++) {
			notas[i].imprimir();
			
		}
		
	}
	

	}
