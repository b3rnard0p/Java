package Exercicio6;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escolha qual opção deseja: ");
            System.out.println("1 - Nome e Preço");
            System.out.println("2 - Nome");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do produto:");
                String nome = scanner.next();

                System.out.println("Digite o preço do produto:");
                double preco = scanner.nextDouble();

                Produto produto = new Produto(nome, preco);
            } else if (opcao == 2) {
                System.out.println("Digite o nome do produto:");
                String nome = scanner.next();

                Produto produto = new Produto(nome);
            } else {
                System.out.println("Opção inválida.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Insira um valor válido para o preço.");
        }

        scanner.close();
	}

}
