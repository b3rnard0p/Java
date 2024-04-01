package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
    	double numero1;
    	double numero2;
    	double resultado;
    	char operacao;
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, x, /): ");
        operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado da Soma: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;
            case 'x':
                resultado = numero1 * numero2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}

