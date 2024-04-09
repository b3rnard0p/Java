package Exercicio7;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: R$" + salario);
    }

    public Funcionario(String nome) {
        this.nome = nome;
        System.out.println("Nome do funcionário: " + nome);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escolha qual opção deseja: ");
            System.out.println("1 - Nome e Salário do funcionário");
            System.out.println("2 - Apenas o nome do funcionário");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.println("Digite o nome do funcionário:");
                String nome = scanner.nextLine();

                System.out.println("Digite o salário do funcionário:");
                double salario = scanner.nextDouble();

                Funcionario funcionario = new Funcionario(nome, salario);
            } else if (opcao == 2) {
                System.out.println("Digite o nome do funcionário:");
                String nome = scanner.nextLine();

                Funcionario funcionario = new Funcionario(nome);
            } else {
                System.out.println("Opção inválida.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Insira um valor válido para o salário.");
        }

        scanner.close();
    }
}
