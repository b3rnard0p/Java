package pkg;
import java.util.Scanner;

public class TesteVetor4 {

	public static void main(String[] args) {
		
		int[] numeros;
 		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite o tamanho do vetor: ");
		n = sc.nextInt();
		numeros = new int[n];
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Digite um número: "+i);
			numeros[i] = sc.nextInt();
		}
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("O elemento de índice"+ i + "é"+ numeros[i]);
		}
		
	}

}
