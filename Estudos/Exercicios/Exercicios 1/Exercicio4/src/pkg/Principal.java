package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, valor3, valor4;
        int soma = 0;

        System.out.println("Digite quatro valores inteiros:");
        valor1 = scanner.nextInt();
        soma += valor1;
        valor2 = scanner.nextInt();
        soma += valor2;
        valor3 = scanner.nextInt();
        soma += valor3;
        valor4 = scanner.nextInt();
        soma += valor4;

        double media = (double) soma / 4;

        System.out.println("Valores superiores à média (" + media + "):");
        if (valor1 > media) {
            System.out.println(valor1);
        }
        if (valor2 > media) {
            System.out.println(valor2);
        }
        if (valor3 > media) {
            System.out.println(valor3);
        }
        if (valor4 > media) {
            System.out.println(valor4);
        }
    }
}

