package cl.clase.java.trabajo;

public class Timer extends Thread {
	
	private Reloj reloj;
	
	
	public Timer (){}
	
	public Timer (Reloj reloj){
		this.reloj = reloj;
	}

	public Reloj getReloj() {
		return reloj;
	}


	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}
	
	@Override
	public void run (){
		
		while (true){
			this.getReloj().imprimir();
			this.getReloj().avanzarSegundo();
			try {
				sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	}
	


