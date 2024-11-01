package Exemplo2;

public class Produto {
   private String nome;
   private double preco;
   
   public Produto(String nome, double preco) {
	  this.nome = nome;
	  this.preco = preco;
   }

   public double getPreco() {
	return preco;
   }

   public void setPreco(double preco) {
	this.preco = preco;
   }

   public String getNome() {
	return nome;
   }
   
   public Produto clone() {
	   return new Produto(this.nome, this.preco); //são diferentes
	   //return this; //São iguais
   }
   
   
   
}
