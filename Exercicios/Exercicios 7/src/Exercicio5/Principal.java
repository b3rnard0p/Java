package Exercicio5;

public class Principal {

    public static void main(String[] args) {
        Casa casa = new Casa();

        int preco1 = casa.calcularPreco(100); 
        System.out.println("Preço da casa com base apenas no tamanho: $" + preco1);

 
        int preco2 = casa.calcularPreco(100, 3); 
        System.out.println("Preço da casa com base no tamanho e no número de quartos: $" + preco2);
    }
}


