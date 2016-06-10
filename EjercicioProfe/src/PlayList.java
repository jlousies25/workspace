import java.util.ArrayList;

public class PlayList {

	private String nombre;
	private ArrayList <Cancion> canciones; 
	private ArrayList <Usuario> seguidores;
	
	public PlayList() {
	}

	public PlayList(String nombre, ArrayList<Cancion> canciones, ArrayList<Usuario> seguidores) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
		this.seguidores = seguidores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public ArrayList<Usuario> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}

	public void agregarCancion (Cancion cancion){
		this.getCanciones().add(cancion);
	}
	
	public void eliminarCancion (Cancion cancion){
		this.getCanciones().remove(cancion);
	}
	 
	
}
