package Exemplo7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor do lado A do triângulo:");
	        double ladoA = scanner.nextDouble();

	        System.out.println("Digite o valor do lado B do triângulo:");
	        double ladoB = scanner.nextDouble();

	        System.out.println("Digite o valor do lado C do triângulo:");
	        double ladoC = scanner.nextDouble();

	        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
	        if (triangulo.verificaEquilatero()) {
	            System.out.println("O triângulo é equilátero.");
	        } else {
	            System.out.println("O triângulo não é equilátero.");
	        }

	        scanner.close();

	}

}
