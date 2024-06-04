package Exemplo1;

public class Cachorro extends Animal {
	public String raca;

	public void emiteSom() {
		System.out.println(""+especie+": au au");
	}
	
	public void cuidarPatio() {
		System.out.println(""+especie+": Cuidando do patio");
	}
	
	 public void exibeDados() {
		   System.out.println("Espécie: "+especie);
		   System.out.println("Idade: "+idade);
		   System.out.println("Reça: "+raca);
	   }

}
