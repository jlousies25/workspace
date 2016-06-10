
public class ProgramaSemaforo {

	public static void main(String[] args) throws InterruptedException {
		
		Rojo rojo = new Rojo();
		Semaforo semaforo = new Semaforo (rojo);
		
		semaforo.cambiarColor();
		semaforo.cambiarColor();
		semaforo.cambiarColor();
		
		while (true)
		{
			semaforo.cambiarColor();
			Thread.sleep(1000);
		}
		
	}

}
