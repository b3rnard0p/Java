package Exercicio4;

public class Gato implements Animal {
    protected String nome;
    protected int idade;

    public void emiteSom() {
        System.out.println("miau miau");
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
