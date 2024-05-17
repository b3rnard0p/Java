package Exemplo8;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome da pessoa:");
	        String nome = scanner.nextLine();

	        System.out.println("Digite a idade da pessoa:");
	        int idade = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.println("Digite o CPF da pessoa:");
	        String cpf = scanner.nextLine();

	        Pessoa pessoa = new Pessoa(nome, idade, cpf);
	        if (pessoa.verificaMaiorDeIdade()) {
	            System.out.println("A pessoa é maior de idade.");
	        } else {
	            System.out.println("A pessoa não é maior de idade.");
	        }

	        scanner.close();

	}

}
