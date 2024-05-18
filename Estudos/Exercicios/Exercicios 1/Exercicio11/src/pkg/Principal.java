package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int placarCasa;
        int placarFora;       
        
        System.out.println("Digite o placar do jogo da primeira fase:");
        System.out.print("Time da Casa: ");
        placarCasa = scanner.nextInt();
        System.out.print("Time de Fora: ");
        placarFora = scanner.nextInt();

        if (placarFora > placarCasa && placarFora - placarCasa > 2) {
            System.out.println("O time de fora já se classificou para a próxima fase.");
        } else {
            System.out.println("Os dois times se enfrentarão em um novo jogo.");

            System.out.println("Digite o placar do segundo jogo:");
            System.out.print("Time da Casa: ");
            int placarCasa2 = scanner.nextInt();
            System.out.print("Time de Fora: ");
            int placarFora2 = scanner.nextInt();

            if (placarCasa + placarCasa2 < placarFora + placarFora2) {
                System.out.println("O time de fora passou de fase.");
            } else {
                System.out.println("O time da casa passou de fase.");
            }
        }

        scanner.close();
    }
}

