package Exercicio2;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso na Conta Investimento. Saldo atual: R$" + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso na Conta Investimento. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque na Conta Investimento.");
        }
    }
}
