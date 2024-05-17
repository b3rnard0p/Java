package jogorapido;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		c.setNome("cao");
		c.setIdade("45");
		c.setRaca("vira lata");
		
		System.out.println("nome do cao: "+c.getNome());
		System.out.println("idade do cao: "+c.getIdade());
		System.out.println("raca do cao: "+c.getRaca());
		
		c.latir();
		
	}

}
