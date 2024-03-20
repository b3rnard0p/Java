package Exercicio4;

public class Livro {
	public String titulo;
	 public String autor;
	 public int anoPublicacao;
    
	 public void imprimirInformacoes() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Ano de Publicação: " + anoPublicacao);
	    }
    
    public static void main(String[] args) {

           Livro pessoa = new Livro();
           pessoa.titulo = "Até logo";
           pessoa.autor = "José";
           pessoa.anoPublicacao = 2010;
           
           pessoa.imprimirInformacoes();    
  
    }
}
