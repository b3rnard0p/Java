package Exercicio1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {	
		
		    Scanner sc = new Scanner(System.in);
		    
			Carro carro = new Carro();
			System.out.println("Digite a marca:");
			carro.marca = sc.nextLine();
			
			System.out.println("Digite o modelo:");
			carro.modelo = sc.nextLine();
			
			System.out.println("Digite o ano de fabrica��o:");
			carro.anoFabricacao = sc.nextInt();
			;
			
			System.out.println("O carro � da marca:"+carro.marca+", do modelo:"+carro.modelo+" e o ano de sua fabrica��o �:"+carro.anoFabricacao);
			
			
	

	}

}
