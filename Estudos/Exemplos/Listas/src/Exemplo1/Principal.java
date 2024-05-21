package Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa("João", 30);
		//meumetodo(pessoa);
		
		List<Pessoa> ListaPessoas = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa("João", 30);
		Pessoa pessoa2 = new Pessoa("Maria", 25);
		Pessoa pessoa3 = new Pessoa("Pedro", 40);
		
		ListaPessoas.add(pessoa1);
		ListaPessoas.add(pessoa2);
		ListaPessoas.add(pessoa3);
		
		exibirPessoas(ListaPessoas);
		

	}

	private static void exibirPessoas(List<Pessoa> lista) {
		for (Pessoa p : lista) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
		}
	}

	//private static void meumetodo(Pessoa p) {
		//System.out.println("Nome: "+ p.getNome());
		//System.out.println("Idade: "+ p.getIdade());
	//}

}