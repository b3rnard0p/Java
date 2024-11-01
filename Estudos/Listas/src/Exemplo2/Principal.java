package Exemplo2;

public class Principal {

	public static void main(String[] args) {
       Produto produto1 = new Produto("Caneta", 1.5);
       Produto produto2 = produto1.clone();
       
       System.out.println("Produto1 - Nome: " +produto1.getNome()+", Preço: "+produto1.getPreco());
       System.out.println("Produto2 - Nome: " +produto2.getNome()+", Preço: "+produto2.getPreco());
       
       produto2.setPreco(2.0);
       
       System.out.println("Produto1 - Nome: " +produto1.getNome()+", Preço: "+produto1.getPreco());
       System.out.println("Produto2 - Nome: " +produto2.getNome()+", Preço: "+produto2.getPreco());
      
       
       if(produto1 == produto2) {
    	   System.out.println("São iguais");
       } else {
    	   System.out.println("Não são iguais");
       }
	}

}
