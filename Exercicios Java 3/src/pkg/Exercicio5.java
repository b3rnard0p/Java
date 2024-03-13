package pkg;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[30];

        System.out.println("Digite trinta números reais:");
        for (int i = 0; i < 30; i++) {
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Posições dos números negativos:");
        for (int i = 0; i < 30; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}

