package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro:");
        int numero = entrada.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
        
        entrada.close();
    }
}
