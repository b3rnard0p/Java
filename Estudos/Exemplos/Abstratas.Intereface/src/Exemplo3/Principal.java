package Exemplo3;

public class Principal {

	public static void main(String[] args) {
		Cachorro c =  new Cachorro();
		c.emiteSom();
		c.cuidarPatio();
		
		Animal cachorro = new Cachorro();
		cachorro.emiteSom();
		
		Animal gato = new Gato();
		gato.emiteSom();

	}

}
