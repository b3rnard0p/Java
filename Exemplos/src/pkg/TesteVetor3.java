package pkg;
import java.util.Scanner;

public class TesteVetor3 {

	public static void main(String[] args) {
		
		int[] numeros = new int[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < numeros.length; i++) {
		System.out.println("Digite um número: "+i);
		numeros[i] = sc.nextInt();
		}
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("O elemento de índice"+ i + "é"+ numeros[i]);
		}
		
		numeros = new int[3];
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Digite um número: "+i);
			numeros[i] = sc.nextInt();
		}
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("O elemento de índice"+ i + "é"+ numeros[i]);
		}

    }
}