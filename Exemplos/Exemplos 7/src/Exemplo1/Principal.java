package Exemplo1;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ricardo", 22);
	
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		
		p.setNome("Rodrigo");
		p.setIdade(30);
		
		System.out.println(p.getNome());
		System.out.println(p.getIdade());

	}

}
