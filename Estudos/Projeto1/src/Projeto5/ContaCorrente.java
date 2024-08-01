package Projeto5;

public class ContaCorrente {
    private float saldo;

    public void definirSaldoInicial(float valor) {
        this.saldo = valor;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public float getSaldo() {
        return this.saldo;
    }
}
