package pkg;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores da diagonal principal:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("Valores da diagonal secundária:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
        }
        scanner.close();
    }
}

