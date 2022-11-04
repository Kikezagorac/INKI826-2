package zadacha.br7;

public class Triagolnik {
	public double a;
	public double b;
	public double c;
	
	public Triagolnik () {
		
	}
	
	public double perimetar () {
		return a + b + c;
	}
	
	public double plostina() {
		double s = (a + b + c)/2;
		return Math.sqrt((s*(s-a)*(s-b)*(s-c))); 
	}
}
