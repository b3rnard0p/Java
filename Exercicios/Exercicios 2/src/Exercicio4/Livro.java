package Exercicio4;

public class Livro {
	public String titulo;
	 public String autor;
	 public int anoPublicacao;
    
	 public void imprimirInformacoes() {
	        System.out.println("T�tulo: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Ano de Publica��o: " + anoPublicacao);
	    }
    
    public static void main(String[] args) {

           Livro pessoa = new Livro();
           pessoa.titulo = "At� logo";
           pessoa.autor = "Jos�";
           pessoa.anoPublicacao = 2010;
           
           pessoa.imprimirInformacoes();    
  
    }
}
