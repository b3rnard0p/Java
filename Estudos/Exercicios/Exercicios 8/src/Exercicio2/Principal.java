package Exercicio2;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000.0, 500.0);
        cc.depositar(200.0);
        cc.sacar(100.0);
        cc.sacar(2000.0);

        ContaInvestimento ci = new ContaInvestimento(2000.0, 0.0);
        ci.depositar(500.0);
        ci.sacar(1000.0);
        ci.sacar(3000.0);
    }
}
