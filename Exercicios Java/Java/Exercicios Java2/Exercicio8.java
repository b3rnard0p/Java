package Exercicio8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cidade;

        do {
            System.out.println("Informe o nome da cidade:");
            cidade = entrada.nextLine();
            
        } while (!cidade.equals("Sao Paulo"));

        entrada.close();
    }
}
