package pkg;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1;
        double valor2;
        double valor3;
        
        
        System.out.println("Digite três valores:");
        valor1 = scanner.nextDouble();
        valor2 = scanner.nextDouble();
        valor3 = scanner.nextDouble();

        double[] valores = {valor1, valor2, valor3};

        Arrays.sort(valores);

        System.out.println("Os valores em ordem crescente são:");
        for (double valor : valores) {
            System.out.println(valor);
        }
    }
}
