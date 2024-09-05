package Exemplo5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ExcecaoSaque {
		 Scanner sc = new Scanner(System.in);
		 double saque;
		 double saldo = 100;
	      System.out.println("Digite o valor para saque: ");
	      saque = sc.nextDouble();
	      sacar(saque, saldo);

	}
	   public static void sacar(double saque, double saldo)throws ExcecaoSaque {
		
		   if(saque < 0 || saque > saldo) {
			   throw new ExcecaoSaque("Não pode efetuar um saque negatio, mutio menos sacar um valor que não tem");
		   } else {
			   System.out.println("Saque efetuado!");
		   }
	}
	   

}
