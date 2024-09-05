package Exemplo3;

public class Gato implements Animal {
	public String nome;
	public int idade;
	
	public void emiteSom() {
		System.out.println("miau miau");

	}
	
	 public void exibeDados() {
		   System.out.println("Nome: "+nome);
		   System.out.println("Idade: "+idade);
	   }

}
