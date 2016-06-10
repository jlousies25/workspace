package cl.clase.java.guia12;

import java.util.Date;

public class Comentario {
	
	private int identificador;
	private Usuario owner;
	private String comentario;
	private Date fecha;

	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comentario(int identificador, Usuario owner, String comentario, Date fecha) {
		super();
		this.identificador = identificador;
		this.owner = owner;
		this.comentario = comentario;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

}
