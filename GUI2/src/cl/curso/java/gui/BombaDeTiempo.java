package cl.curso.java.gui;

public class BombaDeTiempo extends Thread{
	
	private String [] numerosStr= {"Cero", "Uno", "Dos", "tres", "cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
	
	public void run(){
		for (int i = 9 ; i >=0; i --)
		{
			try{
				System.out.println(numerosStr [i]);
				Thread.sleep(1000);
			}catch (InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
	
	public static void main (String[] s) throws InterruptedException {
		BombaDeTiempo timer = new BombaDeTiempo();
		System.out.println("Comienza la cuenta regresiva... ");
		timer.start();
		timer.join();
		System.out.println("boom!!");
		
	}
}
