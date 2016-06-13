package cl.curso.java.prueba_tres.jsilva;

import java.util.Date;

public class viaje implements Comparable {

	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	
	public viaje() {
		super();
		}

	public viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	public int getValorViaje() {
		return valorViaje;
	}

	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	public int compareTo(Viaje viaje) {
		
		return 0;
	}
	
	
}
