import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private ArrayList<String> playList = new ArrayList<String>();
	
	public Usuario() {
	}

	public Usuario(String nombre, ArrayList<String> playList) {
		super();
		this.nombre = nombre;
		this.playList = playList;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getPlayList() {
		return playList;
	}

	public void setPlayList(ArrayList<String> playList) {
		this.playList = playList;
	}
	
	

	
	
}
