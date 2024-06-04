package Exercicio3;

class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= this.saldo + this.limite) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}
