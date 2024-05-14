package Exercicio2;

public class Principal {

	public static void main(String[] args) {
		
		FormaGeometrica a1 = new FormaGeometrica();
		int resultado1 = a1.calcularArea(5, 7);
		System.out.println(""+resultado1);
		
		Triangulo a2 = new Triangulo();
		int resultado2 = a2.calcularArea(5, 7);
		System.out.println(""+resultado2);

	}

}
