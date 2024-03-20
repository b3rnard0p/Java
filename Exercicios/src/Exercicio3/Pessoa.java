package Exercicio3;


public class Pessoa {
    public String nome;
    public int idade;
    public String genero;
    
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
    }
    
    public static void main(String[] args) {

           Pessoa pessoa = new Pessoa();
           pessoa.nome = "José";
           pessoa.idade = 20;
           pessoa.genero = "Masculino";
           
           pessoa.imprimirInformacoes();    
  
    }
}
