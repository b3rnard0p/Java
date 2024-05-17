package Exemplo6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano do carro:");
        int ano = scanner.nextInt();

        Carro carro = new Carro(marca, modelo, ano);
        carro.exibeDetalhes();

        scanner.close();
	}

}
