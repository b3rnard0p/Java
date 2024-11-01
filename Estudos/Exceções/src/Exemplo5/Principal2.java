package Exemplo5;

import java.util.Scanner;

public class Principal2 {

		public static void main(String[] args) throws ExcecaoDeposito {
			 Scanner sc = new Scanner(System.in);
			 double deposito;
			 double saldo = 100;
		      System.out.println("Digite o valor para depositar: ");
		      deposito = sc.nextDouble();
		      sacar(deposito, saldo);

		}
		   public static void sacar(double deposito, double saldo)throws ExcecaoDeposito{
			
			   if(deposito < 0 ) {
				   throw new ExcecaoDeposito("Não pode efetuar um deposito negatio");
			   } else {
				   System.out.println("Deposito efetuado!");
			   }

	}

}
