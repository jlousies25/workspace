package cl.clase.java.guia12;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CarroDeCompra {

	private Usuario usuario;
	private ArrayList<Producto> producto;

	public CarroDeCompra() {
		super();
	}

	public CarroDeCompra(Usuario usuario, ArrayList<Producto> producto) {
		super();
		this.usuario = usuario;
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Producto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

	public void agregarProducto(Producto producto) {
		this.getProducto().add(producto);
	}

	public void eliminarProducto(Producto producto) {
		if (this.getProducto().contains(producto)) {
			this.getProducto().remove(producto);
		} else {
			throw new ProductoNoEncontradoException("no existe");
		}
	}

	public void ordenarPorPrecio() {

		Collections.sort(producto);
	}

	public void imprimir() {
		for (int i = 0; i < this.getProducto().size(); i++) {

			this.getProducto().get(i);
			System.out.println("Nombre: " + this.getProducto().get(i).getNombre());
			System.out.println("Identificador: " + this.getProducto().get(i).getIdentificador());
			System.out.println("Precio: " + this.getProducto().get(i).getPrecio());

		}
	}

}
