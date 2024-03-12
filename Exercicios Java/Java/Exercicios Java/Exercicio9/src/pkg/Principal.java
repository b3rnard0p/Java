package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        
        System.out.println("Digite a idade da pessoa:");
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("A pessoa não está apta a votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }
    }
}

