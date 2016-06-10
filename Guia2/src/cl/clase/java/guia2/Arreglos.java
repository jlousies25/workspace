package cl.clase.java.guia2;

public class Arreglos {
	
	private int Arreglo[] = {0,28,30,10,40};

	public int[] getArreglo() {
		return Arreglo;
	}

	public void setArreglo(int[] arreglo) {
		Arreglo = arreglo;
	}
	
	public void imprimir (){
		for (int i = 0; i < Arreglo.length; i++) {
			System.out.println(Arreglo[i]);
		}
	}
}