package cl.clase.java.claudio;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Programa {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		Nota n1= new Nota("prueba de arreglos" , 5.6, 0.7);
		
		Nota[] notas = new Nota[2];
		
		notas[0] = n1;
		notas[1] = new Nota("Pueba 2", 6.3, 0.5);
		
		Alumno alumno2 = new Alumno("Claudio", "Zara", "Farfan" , "23-04-1991", notas );
		
		alumno1.imprimir();
		
		System.out.println("----------------------------------------------------");

		alumno2.imprimir();
		
		
	}

}
