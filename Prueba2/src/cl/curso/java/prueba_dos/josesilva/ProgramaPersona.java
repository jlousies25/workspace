package cl.curso.java.prueba_dos.josesilva;

public class ProgramaPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona ();
		Persona persona2 = new Persona("manuel", 23, "17.984.857-4", 40, 1.75);
		
		persona1.imprimir();
		
		System.out.println("----------------------------------------------------");
		
		persona2.imprimir();
		
	}

}
