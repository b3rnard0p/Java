package Exercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }
}
