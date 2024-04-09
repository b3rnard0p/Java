package Exercicio4;

public class Funcionario {
	 public String nome;
	 public double salario;

	    public Funcionario(String nome, double salario) {
	        this.nome = nome;
	        this.salario = salario;
	        System.out.println("Nome do funcionário: " + nome);
	        System.out.println("Salário do funcionário: R$" + salario);
	    }

	    public Funcionario(String nome) {
	        this.nome = nome;
	        System.out.println("Nome do funcionário: " + nome);
	    }
}
