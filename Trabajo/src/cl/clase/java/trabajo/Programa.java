package cl.clase.java.trabajo;

public class Programa {

	public static void main(String[] args) {
		Reloj reloj = new Reloj(0,0,0);
		Timer timer = new Timer(reloj);
		timer.start();

	}

}
