package Exercicio7;

import java.util.Scanner;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        System.out.println("Lado 1 do triângulo: " + lado1);
        System.out.println("Lado 2 do triângulo: " + lado2);
        System.out.println("Lado 3 do triângulo: " + lado3);
    }

    public Triangulo(double lado) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
        System.out.println("Lado do triângulo: " + lado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escolha qual opção deseja: ");
            System.out.println("1 - Três lados do triângulo");
            System.out.println("2 - Apenas um lado (triângulo equilátero)");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o lado 1 do triângulo:");
                double lado1 = scanner.nextDouble();

                System.out.println("Digite o lado 2 do triângulo:");
                double lado2 = scanner.nextDouble();

                System.out.println("Digite o lado 3 do triângulo:");
                double lado3 = scanner.nextDouble();

                Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            } else if (opcao == 2) {
                System.out.println("Digite o lado do triângulo:");
                double lado = scanner.nextDouble();

                Triangulo triangulo = new Triangulo(lado);
            } else {
                System.out.println("Opção inválida.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Insira um valor válido para o lado do triângulo.");
        }

        scanner.close();
    }
}

