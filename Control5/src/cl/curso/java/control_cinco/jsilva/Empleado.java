package cl.curso.java.control_cinco.jsilva;

public class Empleado {

	private Departamento departamento;
	private int salario;
	
	public Empleado() {
		super();
		}

	public Empleado(Departamento departamento, int salario) {
		super();
		this.departamento = departamento;
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Empleado) {
			Empleado empleado = (Empleado) obj;
			return this.getDepartamento().equals(empleado.getDepartamento());
		}
		return false;
	
}
}