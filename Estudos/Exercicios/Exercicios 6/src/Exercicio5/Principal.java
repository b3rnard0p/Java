package Exercicio5;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha qual opção deseja: ");
        System.out.println("1 - Marca, Modelo e Sistema Operacional do computador");
        System.out.println("2 - Apenas a marca do computador");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Digite a marca do computador:");
            String marca = scanner.nextLine();

            System.out.println("Digite o modelo do computador:");
            String modelo = scanner.nextLine();

            System.out.println("Digite o sistema operacional do computador:");
            String sistemaOperacional = scanner.nextLine();

            Computador computador = new Computador(marca, modelo, sistemaOperacional);
        } else if (opcao == 2) {
            System.out.println("Digite a marca do computador:");
            String marca = scanner.nextLine();

            Computador computador = new Computador(marca);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

}
