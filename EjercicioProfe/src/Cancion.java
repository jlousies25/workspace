
public class Cancion {

	private String nombre;
	private String artista;
	private int duracionMin;
	
	
	public Cancion() {}


	public Cancion(String nombre, String artista, int duracionMin) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracionMin = duracionMin;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public int getDuracionMin() {
		return duracionMin;
	}


	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Cancion) {
			Cancion cancion = (Cancion) obj;
			return this.getArtista().equals(cancion.getArtista());
		}
		return false;
}
}