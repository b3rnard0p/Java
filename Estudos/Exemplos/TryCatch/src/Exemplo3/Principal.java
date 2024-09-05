package Exemplo3;

public class Principal {

	public static void main(String[] args) {
		String numero = "abc";
		
		try {
			int valor = Integer.parseInt(numero);
		} catch(Exception e) {
			System.out.println("Erro:"+ e.getMessage());
		}
		
		
		
	}

}
