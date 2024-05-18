import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {

            System.out.println("Informe um número inteiro e positivo");
            int numero = entrada.nextInt();
            double total = 1.0;

            if (numero < 0) {
                System.out.println("Você informou um número negativo");
            } else {
                for (double i = 2; i <= numero; i++) {
                    total = total + (1 / i);
                }
                System.out.println(total);
                break;
            }
        }

        entrada.close();

    }
}
