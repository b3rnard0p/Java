package Exemplo1;

public class SobrescritaExemplo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.fazerSom();
		
		animal = new Cachorro();
		animal.fazerSom();
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();
		
		Passarinho passaro = new Passarinho();
		passaro.fazerSom();
		
		Hipopotamo hipo = new Hipopotamo();
		hipo.fazerSom();
		
		Peixe peixe = new Peixe();
		peixe.fazerSom();

	}

}
