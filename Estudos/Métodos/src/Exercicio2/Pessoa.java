package Exercicio2;

import java.util.Scanner;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor com nome e idade utilizado.");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Construtor com idade utilizado.");
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual construtor você gostaria de utilizar?");
        System.out.println("1. Construtor com nome e idade");
        System.out.println("2. Construtor com idade");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        if (opcao == 1) {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade da pessoa:");
            int idade = scanner.nextInt();
            Pessoa pessoa1 = new Pessoa(nome, idade);
        } else if (opcao == 2) {
            System.out.println("Digite a idade da pessoa:");
            int idade = scanner.nextInt();
            Pessoa pessoa2 = new Pessoa(idade);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
