package Exercicio2;

import java.util.Scanner;

import Exercicio1.Produto;

public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Escolha qual opção deseja: ");
	        System.out.println("1 - Nome e Espécie");
	        System.out.println("2 - Nome");
	        int opcao = scanner.nextInt();
	        scanner.nextLine();

	        if (opcao == 1) {
	            System.out.println("Digite o nome do animal:");
	            String nome = scanner.nextLine();

	            System.out.println("Digite a espécie do animal:");
	            String especie = scanner.nextLine();

	            Animal animal = new Animal(nome, especie);
	        } else if (opcao == 2) {
	            System.out.println("Digite o nome do animal:");
	            String nome = scanner.nextLine();

	            Animal animal = new Animal(nome);
	        } else {
	            System.out.println("Opção inválida.");
	        }

	        scanner.close();
	    }
}
