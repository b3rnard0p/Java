package Exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado = 0;
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Divisão por zero não é permitida.");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Operação inválida.");
            }

            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }
}
