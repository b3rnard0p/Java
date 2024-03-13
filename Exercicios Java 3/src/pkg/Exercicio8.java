package pkg;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];

        System.out.println("Digite os valores para preencher a matriz 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores cuja soma dos índices é par:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
                }
            }
        }

        scanner.close();
    }
}
