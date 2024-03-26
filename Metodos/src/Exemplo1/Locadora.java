package Exemplo1;

import java.util.Scanner;

public class Locadora {

	public static void main(String[] args) {
		
		String ma, mo;
		String ma1, mo1, ci1;
		String ma2, mo2, ci2;
		
		Scanner sc = new Scanner(System.in);
		
		Carro c = new Carro();
		
		Moto m1 = new Moto();
		Moto m2 = new Moto();
		
		System.out.println("Carro:");
		
		System.out.println("Digite a marca:");
		ma = sc.nextLine();
		
		System.out.println("Digite o modelo:");
		mo = sc.nextLine();
		
		System.out.println("Moto 1:");
		
		System.out.println("Digite a marca:");
		ma1 = sc.nextLine();
		
		System.out.println("Digite o modelo:");
		mo1 = sc.nextLine();
		
		System.out.println("Digite as cilindradas:");
		ci1 = sc.nextLine();
		
        System.out.println("Moto 2:");
		
		System.out.println("Digite a marca:");
		ma2 = sc.nextLine();
		
		System.out.println("Digite o modelo:");
		mo2 = sc.nextLine();
		
		System.out.println("Digite as cilindradas:");
		ci2 = sc.nextLine();
		
		c.configuraDados(ma, mo);
		
		m1.atribuir(ma1, mo1, ci1);
		
		m2.atribuir(ma2, mo2, ci2);
		
		System.out.println("Dados da moto 1: "+m1.retornaMarca()+" "+m1.retornaModelo()+" "+m1.retornaCilindradas());
		
		System.out.println("Dados da moto 2: "+m2.retornaMarca()+" "+m2.retornaModelo()+" "+m2.retornaCilindradas());
		
		System.out.println("Dados do carro: "+c.retornaMarca()+" "+c.retornaModelo());
		
		c.exibirDados();
		sc.close();

	}

}
