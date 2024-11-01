package Exemplo2;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1 = 0;
		int nota2 = 0;
		String nome = null;
		
		Aluno a1 = new Aluno(nome, nota1, nota2);
		
		System.out.println("Digite nota 1: ");
		nota1 = sc.nextInt();
		
		System.out.println("Digite nota 2: ");
		nota2 = sc.nextInt();
		
		System.out.println("A media da notas: "+a1.calculaMedia(nota1, nota2));
		

	}

}
