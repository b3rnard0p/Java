package pkg;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro(": Fusca", ": VW");
	    c.exibirDados();
	    
	    Carro ca = new Carro(": Gol");
	    ca.marca = "VW";
	    ca.exibirDados();

	}

}
