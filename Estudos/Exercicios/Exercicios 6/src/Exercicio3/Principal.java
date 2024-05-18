package Exercicio3;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha qual opção deseja: ");
        System.out.println("1 - Três lados do triângulo");
        System.out.println("2 - Apenas um lado (triângulo equilátero)");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        if (opcao == 1) {
            System.out.println("Digite o lado 1 do triângulo:");
            double lado1 = scanner.nextDouble();

            System.out.println("Digite o lado 2 do triângulo:");
            double lado2 = scanner.nextDouble();

            System.out.println("Digite o lado 3 do triângulo:");
            double lado3 = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        } else if (opcao == 2) {
            System.out.println("Digite o lado do triângulo:");
            double lado = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(lado);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

	}
