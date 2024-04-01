package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1;
        double valor2;
        double valor3;
        double maior;
        
        System.out.println("Digite três valores:");
        valor1 = scanner.nextDouble();
        valor2 = scanner.nextDouble();
        valor3 = scanner.nextDouble();

        maior = valor1;
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }

        System.out.println("O maior valor é: " + maior);
    }
}

