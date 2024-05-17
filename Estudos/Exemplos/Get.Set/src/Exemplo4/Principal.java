package Exemplo4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o raio do círculo:");
	        double raio = scanner.nextDouble();

	        Circulo circulo = new Circulo(raio);

	        System.out.println("A área do círculo é: " + circulo.calculaArea());

	        scanner.close();

	}

}
