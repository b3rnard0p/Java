package Exercicio3;

class ContaInvestimento extends Conta {

    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso na Conta Investimento. Saldo atual: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso na Conta Investimento. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque na Conta Investimento.");
        }
    }
}
