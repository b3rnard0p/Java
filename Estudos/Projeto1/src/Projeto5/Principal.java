package Projeto5;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();

        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo inicial: " + novaConta.getSaldo());

        if (novaConta.sacar(500)) {
            System.out.println("Saque de 500 reais realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de 500 reais.");
        }

        novaConta.depositar(50);
        
        System.out.println("Saldo após depósito de 50 reais: " + novaConta.getSaldo());

        if (novaConta.sacar(600)) {
            System.out.println("Saque de 600 reais realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de 600 reais.");
        }

        System.out.println("Saldo final: " + novaConta.getSaldo());
    }
}

