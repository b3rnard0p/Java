package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double marcacaoInicio;
        double marcacaoFinal;
        double valorTotalRecebido;
        double litrosCombustivel;
        
        
        System.out.print("Digite a marcação do odômetro no início do dia (em Km): ");
        marcacaoInicio = scanner.nextDouble();

        System.out.print("Digite a marcação do odômetro no final do dia (em Km): ");
        marcacaoFinal = scanner.nextDouble();

        double totalQuilometragem = marcacaoFinal - marcacaoInicio;

        System.out.print("Digite o número de litros de combustível gasto: ");
        litrosCombustivel = scanner.nextDouble();

        double mediaConsumo = totalQuilometragem / litrosCombustivel;

        System.out.print("Digite o valor total recebido dos passageiros (em R$): ");
        valorTotalRecebido = scanner.nextDouble();

        double lucroDia = valorTotalRecebido - (litrosCombustivel * 4.90);

        System.out.println("Média de consumo: " + mediaConsumo + " Km/l");
        System.out.println("Lucro líquido do dia: R$ " + lucroDia);

        scanner.close();
    }
}
