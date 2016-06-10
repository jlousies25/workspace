package cl.curso.java.control_cinco.jsilva;

import java.util.List;

public class Empresa {

	private String nombre;
	private List<Empleado> empleados;
	
	public Empresa() {
		super();
	}

	public Empresa(String nombre, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
}
