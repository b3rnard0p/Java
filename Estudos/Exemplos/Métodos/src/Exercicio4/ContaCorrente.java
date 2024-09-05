package Exercicio4;

import java.util.Scanner;

public class ContaCorrente {
    public float saldo;

    public void definirSaldoInicial(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
            return false;
        }
    }

    public boolean sacar(float valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque ou valor inválido.");
            return false;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Definir saldo inicial");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver saldo");
            System.out.println("5. Sair");

            System.out.println("Escolha uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.println("Digite o saldo inicial:");
                    float saldoInicial = scanner.nextFloat();
                    conta.definirSaldoInicial(saldoInicial);
                    System.out.println("Saldo inicial definido com sucesso.");
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito:");
                    float valorDeposito = scanner.nextFloat();
                    if (conta.depositar(valorDeposito)) {
                        System.out.println("Depósito realizado com sucesso.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor do saque:");
                    float valorSaque = scanner.nextFloat();
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso.");
                    }
                    break;

                case 4:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
