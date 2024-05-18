package Exercicio4;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

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

	        scanner.close();
	    }

	}

