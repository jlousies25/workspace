package cl.curso.java.gui;

public class HiloEjemplo implements Runnable {
	@Override
	public void run () {
		System.out.println("El nombre del thread es: " + Thread.currentThread().getName());
	}
	
	public static void main (String args []){
		Thread thread = new Thread (new HiloEjemplo());
		thread.start();
		System.out.println("metodo main; El nombre del thread es: "+ thread.currentThread().getName());
	}

}
