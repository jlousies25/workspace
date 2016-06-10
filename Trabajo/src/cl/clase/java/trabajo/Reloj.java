package cl.clase.java.trabajo;

public class Reloj {
	
	private int hr;
	private int min;
	private int seg;
	
	public Reloj(int hr, int min, int seg) {
		super();
		this.hr = hr;
		this.min = min;
		this.seg = seg;
		               
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	public void avanzarSegundo(){
		this.seg ++;
		if (this.seg== 60){
			this.seg = 0;
			avanzarMinuto();}
		
	}
	
	public void avanzarMinuto(){
		this.min ++;
		if (this.min == 60){
			this.min = 0;
			avanzarHora();}
		
	}
	
	public void avanzarHora(){
		this.hr ++;
		if (this.hr == 24){
			this.hr = 0;}
		}
			
	public void imprimir()
	{
		System.out.println(this.hr + ":" + this.min + ":" + this.seg + ":");
	}
	
	
}

