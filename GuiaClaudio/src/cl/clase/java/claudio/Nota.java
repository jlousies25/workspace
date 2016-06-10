package cl.clase.java.claudio;

public class Nota {

	private String nombreEvaluacion;
	private double evaluacion;
	private double porcentaje;
	
	public Nota (){}
	
	public Nota(String nombreEvaluacion, double evaluacion, double porcentaje) {
		super();
		this.nombreEvaluacion = nombreEvaluacion;
		this.evaluacion = evaluacion;
		this.porcentaje = porcentaje;
		
	}
	public String getNombreEvaluacion() {
		return nombreEvaluacion;
	}
	public void setNombreEvaluacion(String nombreEvaluacion) {
		this.nombreEvaluacion = nombreEvaluacion;
	}
	public double getEvaluacion() {
		return evaluacion;
	}
	public void setEvaluacion(double evaluacion) {
		this.evaluacion = evaluacion;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public void imprimir () {
		System.out.println(this.getNombreEvaluacion() + " " + this.evaluacion + " " + this.porcentaje);
	}
}
