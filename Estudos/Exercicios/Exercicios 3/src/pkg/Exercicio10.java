package pkg;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somaPrincipal = 0;
        int somaSecundaria = 0;


        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 5; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][4 - i];
        }

        if (somaPrincipal == somaSecundaria) {
            System.out.println("A soma dos elementos da diagonal principal é igual à soma dos elementos da diagonal secundária.");
        } else {
            System.out.println("A soma dos elementos da diagonal principal não é igual à soma dos elementos da diagonal secundária.");
        }
        scanner.close();
    }
}

