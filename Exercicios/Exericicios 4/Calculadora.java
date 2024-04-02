import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        double resultadoSoma = RealizaConta.soma(valor1, valor2);
        System.out.println("Soma: " + resultadoSoma);

        double resultadoSubtracao = RealizaConta.subtracao(valor1, valor2);
        System.out.println("Subtração: " + resultadoSubtracao);

        double resultadoDivisao = RealizaConta.divisao(valor1, valor2);
        System.out.println("Divisão: " + resultadoDivisao);

        double resultadoMultiplicacao = RealizaConta.multiplicacao(valor1, valor2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        scanner.close();
    }
}
