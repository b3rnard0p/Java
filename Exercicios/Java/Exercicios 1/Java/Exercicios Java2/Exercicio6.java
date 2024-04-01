package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
        
            System.out.println("Informe um número:");
            numero = entrada.nextInt();
                
        } while (numero != 0);
        
        entrada.close();
    }
}
