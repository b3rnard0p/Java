package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;
        
        System.out.println("Digite dois valores:");
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os valores são múltiplos um do outro.");
        } else {
            System.out.println("Os valores não são múltiplos um do outro.");
        }
    }
}
