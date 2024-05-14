package Exercicio3;

public class Principal {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		double resultado = c1.calcularSaldo(1000);
		System.out.println("Saldo conta bancaria: "+resultado);
		
		ContaCorrente c2 = new ContaCorrente();
		double resultado1 = c2.calcularSaldo(1000,200);
		System.out.println("Saldo conta corrente: "+resultado1);

	}

}
