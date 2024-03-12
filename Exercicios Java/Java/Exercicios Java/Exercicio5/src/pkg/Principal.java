package pkg;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        
        System.out.println("Digite as coordenadas x e y do ponto:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("O ponto está no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no terceiro quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no quarto quadrante.");
        } else if (x == 0 && y != 0) {
            System.out.println("O ponto está sobre o eixo y.");
        } else if (x != 0 && y == 0) {
            System.out.println("O ponto está sobre o eixo x.");
        } else {
            System.out.println("O ponto está na origem.");
        }
    }
}
