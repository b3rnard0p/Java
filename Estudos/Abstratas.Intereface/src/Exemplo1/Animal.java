package Exemplo1;

public abstract class Animal {
	public String especie;
	public int idade;
	
   public abstract void emiteSom();

   public void exibeDados() {
	   System.out.println("Espécie: "+especie);
	   System.out.println("Idade: "+idade);
   }
	
   
   
}
