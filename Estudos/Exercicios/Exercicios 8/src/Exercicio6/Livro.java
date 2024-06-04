package Exercicio6;

class Livro implements Produto {
    private String nome;
    private double preco;
    private String descricao;

    public Livro(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
