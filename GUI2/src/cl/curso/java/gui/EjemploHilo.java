package cl.curso.java.gui;

public class EjemploHilo extends Thread {

	@Override
	public void run(){
		try {
			sleep(1000);
		}catch (InterruptedException ex) {
		}
		
		System.out.println("el nombre del thread es: " + getName());
		
	}
	
	public static void main (String args[]){
		EjemploHilo thread = new EjemploHilo();
		thread.run();
		System.out.println("Metodo main; El nombre del thread es: "+ thread.currentThread().getName());
		
	}
}
