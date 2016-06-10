package cl.clase.java.guia12;

public class Producto implements Comparable <Producto>{

	private int identificador;
	private String nombre;
	private int precio;
	
	public Producto() {
		super();
	}

	public Producto(int identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Producto) {
			Producto producto = (Producto) obj;
			return this.getPrecio()== producto.getPrecio();
		}
		return false;
}
	@Override
	public int compareTo(Producto o) {
		if (this.getPrecio() > o.getPrecio())
			return 1;
		if (this.getPrecio() < o.getPrecio())
			return -1;
		if (this.getPrecio() == o.getPrecio())
			return 0;
		return 0;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}



