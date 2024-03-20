package Exercicio;
import java.util.Scanner;

public class Disciplina {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		Professor p1 = new Professor();
		System.out.println("Digite o nome do professor:");
		p1.nome = sc.nextLine();
		
		Laboratorio l1 = new Laboratorio();
		System.out.println("Digite o local da aula:");
		l1.local = sc.nextLine();
		
		System.out.println("O nome do professor é:"+p1.nome);
		System.out.println("O local da aula é:"+l1.local);
		
		
		
		

	}

}
