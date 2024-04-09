package Exercicio3;

public class Triangulo {
	 public double lado1;
	 public double lado2;
	 public double lado3;

	    public Triangulo(double lado1, double lado2, double lado3) {
	        this.lado1 = lado1;
	        this.lado2 = lado2;
	        this.lado3 = lado3;
	        System.out.println("Lado 1 do triângulo: " + lado1);
	        System.out.println("Lado 2 do triângulo: " + lado2);
	        System.out.println("Lado 3 do triângulo: " + lado3);
	    }

	    public Triangulo(double lado) {
	        this.lado1 = lado;
	        this.lado2 = lado;
	        this.lado3 = lado;
	        System.out.println("Lado do triângulo: " + lado);
	    }
}
