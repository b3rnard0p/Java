package Exemplo3;

public class Cachorro implements Animal {
	public String nome;
	public int idade;
	
	public void emiteSom() {
		System.out.println("au au");

	}
	
	public void cuidarPatio() {
		System.out.println("Cuidando do patio");
	}
	
	 public void exibeDados() {
		   System.out.println("Nome: "+nome);
		   System.out.println("Idade: "+idade);
	   }

}
