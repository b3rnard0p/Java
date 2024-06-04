package Exemplo1;

public class Principal {

	public static void main(String[] args) {
		Cachorro c =  new Cachorro();
		c.especie = "Dog";
		c.idade = 10;
		c.raca = "Salsicha";
		c.exibeDados();
		c.emiteSom();
		c.cuidarPatio();
		
		
	}

}
