package Exercicio2;
import java.util.Scanner;

public class Computador {
    public String marca;
    public String modelo;
    public String tipo;
    public double preco;

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        Computador c1 = new Computador ();
        System.out.println("Digite a marca do primeiro computador:");
        c1.marca = scanner.nextLine();

        System.out.println("Digite o modelo do primeiro computador:");
        c1.modelo = scanner.nextLine();

        System.out.println("Digite o tipo do primeiro computador:");
        c1.tipo = scanner.nextLine();

        System.out.println("Digite o preço do primeiro computador:");
        c1.preco = scanner.nextDouble();
        scanner.nextLine(); 
        
        
        Computador c2 = new Computador ();
        System.out.println("Digite a marca do segundo computador:");
        c2.marca = scanner.nextLine();

        System.out.println("Digite o modelo do segundo computador:");
        c2.modelo = scanner.nextLine();

        System.out.println("Digite o tipo do segundo computador:");
        c2.tipo = scanner.nextLine();

        System.out.println("Digite o preço do segundo computador:");
        c2.preco = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("O computador 1 é da marca:"+c1.marca+", do modelo:"+c1.modelo+", do tipo:"+c1.tipo+" e o preço é:"+c1.preco);
        System.out.println("O computador 2 é da marca:"+c2.marca+", do modelo:"+c2.modelo+", do tipo:"+c2.tipo+" e o preço é:"+c2.preco);




        scanner.close();
    }
}
