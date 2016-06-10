package cl.curso.java.gui;

//import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		
//		JFrame ventana = new JFrame();
//		ventana.setSize(400, 400);
//		ventana.getContentPane().setLayout(null);
//		
//		JLabel lblHolaMundo = new JLabel("hola mundo!");
//		lblHolaMundo.setBounds(276, 21, 70, 16);
//		ventana.getContentPane().add(lblHolaMundo);
//		ventana.setVisible(true);
		
		Hilo hilo = new Hilo();
		
		Thread thread = new Thread(new Ejecucion());
		
		
		Thread threadA = new Thread (new Runnable() 
		{
			public void run()
				 {
						
						for (int i = 0 ; i<100 ; i ++)
						{
						System.out.println(i);
						}
						try
						{Thread.sleep(1000);
						}
						catch (InterruptedException e){
							
							e.printStackTrace();
						}
				 }
				
	
		});
		hilo.start();
		threadA.start();
		thread.start();
			
		System.out.println("Fin programa");
		

	}
}
