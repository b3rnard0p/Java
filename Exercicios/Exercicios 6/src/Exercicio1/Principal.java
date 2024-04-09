package Exercicio1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha qual opção deseja: ");
		System.out.println("1-Nome e Preço");
		System.out.println("2-Nome");
		int opcao = scanner.nextInt();
		scanner.nextLine();
		
	     if (opcao == 1) {
	            System.out.println("Digite o nome do produto:");
	            String nome = scanner.nextLine();

	            System.out.println("Digite o preço do produto:");
	            double preco = scanner.nextDouble();

	            Produto produto = new Produto(nome, preco);
	            
	        } else if (opcao == 2) {
	            System.out.println("Digite o nome do produto:");
	            String nome = scanner.nextLine();

	            Produto produto = new Produto(nome);
	        } else {
	            System.out.println("Opção inválida.");
	        }

	        scanner.close();

	}

}
