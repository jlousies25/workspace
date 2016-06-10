package cl.curso.java.ppt;

public class Programa {

	
	public static void main(String[] args) {
		
		Piedra piedra = new Piedra();
		Papel papel = new Papel();
		Tijera tijera = new Tijera();
		
		piedra.jugar( papel );
		tijera.jugar(piedra);

	}

}
