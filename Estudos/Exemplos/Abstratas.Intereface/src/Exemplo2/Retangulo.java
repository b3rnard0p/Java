package Exemplo2;

public class Retangulo extends Forma {
   public double largura;
   public double altura;
   
	public Retangulo(double largura, double altura) {
	this.largura = largura;
	this.altura = altura;
    }

	public double area() {
		return largura * altura;
	}

	public double perimetro() {
		return 2* (largura+altura);
	}
   
}
