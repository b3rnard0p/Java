package Exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            String numeroStr = scanner.nextLine();
            double numero = Double.parseDouble(numeroStr);
            System.out.println("O número digitado é: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Não foi possível converter o número. Certifique-se de que seja um formato válido.");
        }
        scanner.close();
    }
}
