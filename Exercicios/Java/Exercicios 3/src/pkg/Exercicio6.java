package pkg;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite dez números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        scanner.close();
    }
}
