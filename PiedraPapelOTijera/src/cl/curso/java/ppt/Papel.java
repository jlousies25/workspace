package cl.curso.java.ppt;

public class Papel extends Jugada{

	@Override
	public void jugar(Jugada jugada) {
		jugada.jugarContraPapel();
		
	}

	@Override
	public void jugarContraPapel() {
		System.out.println("empate");
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println("gana papel");
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println("pierde papel");
		
	}



}