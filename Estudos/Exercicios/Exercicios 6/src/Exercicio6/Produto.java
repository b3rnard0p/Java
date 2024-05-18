package Exercicio6;

public class Produto {
	public String nome;
    public Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: R$" + preco);
    }

    public Produto(String nome) {
        this.nome = nome;
        System.out.println("Nome do produto: " + nome);
    }

}
