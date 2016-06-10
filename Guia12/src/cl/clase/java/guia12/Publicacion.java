package cl.clase.java.guia12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Publicacion {

	private int identificador;
	private String password;
	private Usuario owner;
	private LinkedList<Like> like;
	private ArrayList<Comentario> comentario;
	
	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Publicacion(int identificador, String password, Usuario owner, LinkedList<Like> like,
			ArrayList<Comentario> comentario) {
		super();
		this.identificador = identificador;
		this.password = password;
		this.owner = owner;
		this.like = like;
		this.comentario = comentario;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario getOwner() {
		return owner;
	}
	public void setOwner(Usuario owner) {
		this.owner = owner;
	}
	public LinkedList<Like> getLike() {
		return like;
	}
	public void setLike(LinkedList<Like> like) {
		this.like = like;
	}
	public ArrayList<Comentario> getComentario() {
		return comentario;
	}
	public void setComentario(ArrayList<Comentario> comentario) {
		this.comentario = comentario;
	}
	
	
}
