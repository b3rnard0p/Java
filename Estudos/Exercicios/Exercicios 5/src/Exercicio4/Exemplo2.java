package Exercicio4;

public class Exemplo2 {
    public static void main(String[] args) {
    	
    	//ClassNotFoundException: Lançada quando uma classe solicitada não pode ser encontrada 
    	//durante a execução do programa,geralmente porque a classe não está no classpath.
    	
        try {
            Class.forName("MinhaClasseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Classe não encontrada.");
            e.printStackTrace();
        }
    }
}

