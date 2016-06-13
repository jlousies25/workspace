package cl.curso.java.prueba_tres.jsilva;

import java.io.Reader;
import java.util.Collections;
import java.util.List;

public class TarjetaBip {
	
	private int numeroTarjeta;
	private int Saldo;
	private List<viaje> viajes;
	
	public TarjetaBip() {
		super();
	}

	public TarjetaBip(int numeroTarjeta, int saldo, List<viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		Saldo = saldo;
		this.viajes = viajes;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	public List<viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<viaje> viajes) {
		this.viajes = viajes;
	}
	
	public void recargar (){
	
		this.Saldo= this.getSaldo() + recargar();
	}

	public void pagarViaje (){
		if (Saldo > this.getSaldo())
			throw new SinSaldoException ("Sin Saldo");
	}
	
	@SuppressWarnings("unchecked")
	public void imprimir (){
		
			Collections.sort(viajes);
			System.out.println("numero tarjeta=" + numeroTarjeta + " " + "su saldo es = " + Saldo + " " + "Cantidad de Viajes = " + viajes);
		}

}
