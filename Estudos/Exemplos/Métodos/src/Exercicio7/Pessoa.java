package Exercicio7;

import java.util.Scanner;

public class Pessoa {
    public String nome;
    public String email;
    public String dataNascimento;
    public String endereco;
    public boolean admin;

    public Pessoa(String nome, String email, String dataNascimento, String endereco, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.admin = admin;
    }

    public Pessoa(String nome, String email, String dataNascimento, String endereco) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.admin = false;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void promoverAdmin() {
        admin = true;
    }

    public String toString() {
        String info = "Nome: " + nome + "\n" +
                      "Email: " + email + "\n" +
                      "Data de Nascimento: " + dataNascimento + "\n" +
                      "Endereço: " + endereco + "\n" +
                      "Admin: " + (admin ? "Sim" : "Não");
        return info;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro da primeira pessoa:");

        System.out.println("Digite o nome da pessoa:");
        String nome1 = scanner.nextLine();

        System.out.println("Digite o email da pessoa:");
        String email1 = scanner.nextLine();

        System.out.println("Digite a data de nascimento da pessoa:");
        String dataNascimento1 = scanner.nextLine();

        System.out.println("Digite o endereço da pessoa:");
        String endereco1 = scanner.nextLine();

        Pessoa pessoa1 = new Pessoa(nome1, email1, dataNascimento1, endereco1);

        System.out.println("\nCadastro da segunda pessoa:");

        System.out.println("Digite o nome da pessoa:");
        String nome2 = scanner.nextLine();

        System.out.println("Digite o email da pessoa:");
        String email2 = scanner.nextLine();

        System.out.println("Digite a data de nascimento da pessoa:");
        String dataNascimento2 = scanner.nextLine();

        System.out.println("Digite o endereço da pessoa:");
        String endereco2 = scanner.nextLine();

        Pessoa pessoa2 = new Pessoa(nome2, email2, dataNascimento2, endereco2);

        System.out.println("\nEscolha uma pessoa para promover a administrador (1 ou 2):");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 1) {
            pessoa1.promoverAdmin();
            System.out.println(pessoa1.getNome() + " foi promovido a administrador!");
        } else if (escolha == 2) {
            pessoa2.promoverAdmin();
            System.out.println(pessoa2.getNome() + " foi promovido a administrador!");
        } else {
            System.out.println("Escolha inválida.");
        }

        System.out.println("\nLista das pessoas cadastradas:");
        System.out.println("Pessoa 1:");
        System.out.println(pessoa1.toString());
        System.out.println();
        System.out.println("Pessoa 2:");
        System.out.println(pessoa2.toString());

        scanner.close();
    }
}
