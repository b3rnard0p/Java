package Exemplo3;

public class Principal {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua 1", 123);
		Pessoa pessoa = new Pessoa("João",30, endereco);
		
		//Pessoa pessoa = new Pessoa("João",30, new Endereco("Rua 1", 123));
		
		System.out.println("Nome:" + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Endereço: " + pessoa.getEndereco().getRua() + ", " 
		                   + "" + pessoa.getEndereco().getNumero());
 
	}

}
