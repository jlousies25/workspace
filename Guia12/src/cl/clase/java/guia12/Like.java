package cl.clase.java.guia12;

import java.util.Date;

public class Like {

	private int identificador;
	private Usuario owner;
	private Date fecha;
	
	public Like() {
		super();
		}

	public Like(int identificador, Usuario owner, Date fecha) {
		super();
		this.identificador = identificador;
		this.owner = owner;
		this.fecha = fecha;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public Usuario getOwner() {
		return owner;
	}

	public void setOwner(Usuario owner) {
		this.owner = owner;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
