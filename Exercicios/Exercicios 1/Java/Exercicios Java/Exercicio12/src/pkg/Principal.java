package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        
        System.out.println("Digite o valor do salário mensal:");
        salario = scanner.nextDouble();

        double aliquota = 0;
        double valorImposto = 0;

        if (salario <= 1566.61) {
            aliquota = 0;
        } else if (salario <= 2347.85) {
            aliquota = 7.5;
            valorImposto = (salario - 1566.62) * 0.075;
        } else if (salario <= 3130.51) {
            aliquota = 15.0;
            valorImposto = (salario - 2347.86) * 0.15 + 117.49;
        } else if (salario <= 3911.63) {
            aliquota = 22.5;
            valorImposto = (salario - 3130.52) * 0.225 + 293.74;
        } else {
            aliquota = 27.5;
            valorImposto = (salario - 3911.64) * 0.275 + 662.34;
        }

        System.out.println("Alíquota do Imposto de Renda: " + aliquota + "%");
        System.out.println("Valor do Imposto de Renda: R$ " + valorImposto);

        scanner.close();
    }
}

