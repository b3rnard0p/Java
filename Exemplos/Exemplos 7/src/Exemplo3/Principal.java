package Exemplo3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Digite o limite da conta:");
        double limite = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial, limite);

        System.out.println("Digite o valor a ser sacado:");
        double valorSaque = scanner.nextDouble();

        conta.sacar(valorSaque);

        scanner.close();
	}

}
