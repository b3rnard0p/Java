package Exercicio2;

public class Animal {
	  public String nome;
	  public String especie;
		
	  public Animal (String nome, String especie) {
		  this.nome = nome;
		  this.especie = especie;
		  System.out.println("Nome do animal: " + nome);
	      System.out.println("A espécie: " + especie);
	  }
	  
	  public Animal (String nome) {
		  this.nome = nome;
		  System.out.println("Nome do animal: " + nome);
	  }
	}

