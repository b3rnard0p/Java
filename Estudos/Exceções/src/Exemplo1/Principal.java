package Exemplo1;

public class Principal {

	public static void main(String[] args) {
		
		try {
		  int[] numeros = {1,2,3};
		  System.out.println(numeros[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Erro: índice fora do array");
		} catch(Exception e) {
			System.out.println("Exceção: "+e.toString());
		}
	}

}
