package Exemplo3;

public class SobrecargaExemplo {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int resultado1 = calculadora.Somar(2,3);
		int resultado2 = calculadora.Somar(2,3,4);
		System.out.println("Resultado1: "+ resultado1);
		System.out.println("Resultado1: "+ resultado2);
		double resultado3 = calculadora.Somar(3,7);
		System.out.println("Resultado3: "+ resultado3);

	}

}
