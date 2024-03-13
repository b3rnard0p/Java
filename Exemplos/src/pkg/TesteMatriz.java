package pkg;
import java.util.Scanner;

public class TesteMatriz {

	public static void main(String[] args) {
		
        int[][] matriz = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite um numero ["+i+"]["+j+"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i <matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]+" ");
			}	
			System.out.println();
	     }
		
		//for(int[] linha : matriz) {
	    //for(int elemento : linha) {
		//System.out.println("Elemento: "+elemento);
		//}
		//System.out.println("Final da linha!");
		//}
		
	

	}

}
