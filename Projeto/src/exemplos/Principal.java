package exemplos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		System.out.println("Digite o nome da pessoa 1:");
		p1.nome = sc.next();
		
		System.out.println("Digite a idade da pessoa 1:");
		p1.idade = sc.nextInt();
	    
		Pessoa p2 = new Pessoa();
		System.out.println("Digite o nome da pessoa 2:");
		p2.nome = sc.next();
		
		System.out.println("Digite a idade da pessoa 2:");
		p2.idade = sc.nextInt();
		
		Pessoa p3 = new Pessoa();
		System.out.println("Digite o nome da pessoa 3:");
		p3.nome = sc.next();
		
		System.out.println("Digite a idade da pessoa 3:");
		p3.idade = sc.nextInt();
		
		System.out.println("O nome da pessoa 1 é:"+p1.nome+" e a idade é:"+p1.idade);
		System.out.println("O nome da pessoa 2 é:"+p2.nome+" e a idade é:"+p2.idade);
		System.out.println("O nome da pessoa 3 é:"+p3.nome+" e a idade é:"+p3.idade);
		
		//System.out.println("A idade da pessoa 1 é:"+p1.idade);
		//System.out.println("A idade da pessoa 2 é:"+p2.idade);
		//System.out.println("A idade da pessoa 3 é:"+p3.idade);
		//System.out.println("O nome da pessoa é:"+p.nome);
		//System.out.println("E tem:"+p.idade+" anos!");
		//System.out.println("A pessoa foi instanciada!");

	}

}
