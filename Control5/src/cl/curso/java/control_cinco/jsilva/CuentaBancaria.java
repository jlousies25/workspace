package cl.curso.java.control_cinco.jsilva;

import java.util.Collections;
import java.util.List;

public class CuentaBancaria {

	private int numero;
	private List<Transaccion> transacciones;
	
	public CuentaBancaria() {
		super();
	}

	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	
	public void ordenarTransaccionesPorFecha(){
	
		
	}
	
	public void ordenarTransaccionesPorTipo(){
		
	}
	
	public void imprimir (){
		
		System.out.println();
	}
	
	
}