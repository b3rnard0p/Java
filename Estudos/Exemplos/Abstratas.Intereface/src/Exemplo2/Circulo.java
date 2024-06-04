package Exemplo2;

public class Circulo extends Forma{
	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double area() {
		return Math.PI * raio*raio;
	}

	public double perimetro() {
		return 2 * Math.PI  * raio;
	}

}
