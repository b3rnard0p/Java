package Exercicio1;

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
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirSaldoInicial(1000);

        System.out.println("Saldo inicial: " + novaConta.getSaldo());

        novaConta.sacar(500);
        novaConta.depositar(50);

        System.out.println("Saldo após saque de 500 e depósito de 50: " + novaConta.getSaldo());

        novaConta.sacar(600);
        System.out.println("Saldo após saque de 600: " + novaConta.getSaldo());
    }
}
