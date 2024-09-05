package Exemplo5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite a base do retângulo:");
		        double base = scanner.nextDouble();

		        System.out.println("Digite a altura do retângulo:");
		        double altura = scanner.nextDouble();

		        Retangulo retangulo = new Retangulo(base, altura);
		        System.out.println("Área do retângulo: " + retangulo.calculaArea());

		        scanner.close();
		    }

	}

