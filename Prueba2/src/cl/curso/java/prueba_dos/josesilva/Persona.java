package cl.curso.java.prueba_dos.josesilva;

public class Persona {
	
	private String nombre;
	private int edad;
	private String rut;
	private double peso;
	private double altura;
	private double IMC;
	
	public Persona ()
	{
		this.nombre = "Francisco";
		this.edad = 69;
		this.rut = "11.234.435-k";
		this.peso = 100.7;
		this.altura = 1.75;
		this.IMC= (peso / (altura * altura));
	}
	
	public Persona(String nombre, int edad, String rut, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.rut = rut;
		this.peso = peso;
		this.altura = altura;
		this.IMC = (peso / (altura * altura));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getIMC() {
		return IMC;
	}

	public void setIMC(double iMC) {
		IMC = iMC;
	}

	public int calcularIMC (){
		if (this.peso < this.IMC){
			this.IMC = -1;
			return -1;
		}
		else
			{
			if(this.peso == this.IMC){
				this.IMC = 0;
				return 0;
			}
			 else{
				 this.IMC = 1;
				return 1;}
					
			}
	}

	public boolean esMayorDeEdad(){
		
		if (this.edad < 50)
		{
			return false;
		}
		else
		{	 
			return true;
		}
	}
		public void imprimir(){
			System.out.println("Nombre: " + this.nombre 
					+ "\nedad: " + this.edad + "\nrut: " + this.rut + "\npeso: " + this.peso +"kg"
					+ "\naltura: " + this.altura +"mtrs" +"\nEs Mayor de edad: " 
					+ esMayorDeEdad() + "\nPeso Ideal: " + calcularIMC());
		
		}
}

