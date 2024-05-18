package pkg;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0;
        int contImpares = 0;

        System.out.println("Digite dez números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[contPares] = numeros[i];
                contPares++;
            } else {
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }

        System.out.println("Números pares:");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        scanner.close();
    }
}
