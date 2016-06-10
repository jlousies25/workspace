package cl.clase.java.divisor;

public class Division {
	
	private double divisor;
	private double dividendo;
	
	public Division(double divisor, double dividendo) {
		super();
		this.divisor = divisor;
		this.dividendo = dividendo;
	}
	
	
	
	public double getDivisor() {
		return divisor;
	}


	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}


	public double getDividendo() {
		return dividendo;
	}


	public void setDividendo(double dividendo) {
		this.dividendo = dividendo;
	}


	public void setDivisor(int divisor)
	{
		this.divisor = divisor;
	}

	
}
