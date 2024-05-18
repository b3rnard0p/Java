package pkg;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];
        int[] soma = new int[20];

        System.out.println("Digite vinte números para o primeiro vetor:");
        for (int i = 0; i < 20; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite vinte números para o segundo vetor:");
        for (int i = 0; i < 20; i++) {
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }
        
        System.out.println("Resultado da soma dos elementos de mesma posição:");
        for (int i = 0; i < 20; i++) {
            System.out.print(soma[i] + " ");
        }

        scanner.close();
    }
}
