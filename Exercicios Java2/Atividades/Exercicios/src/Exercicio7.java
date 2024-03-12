package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        do {
            System.out.println("Informe a nota:");
            nota = entrada.nextFloat();
        } while (nota != -1);
        entrada.close();
    }
}
