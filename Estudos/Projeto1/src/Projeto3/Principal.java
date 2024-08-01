package Projeto3;

public class Principal {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        Livro l = new Livro();
        
        p.nome = "Bernardo";
        p.idade = 19;
        p.genero = "Masculino";
        
        l.titulo = "Dracula";
        l.ano = 1972;
        l.autor = "Bernardo";
        
        System.out.println("Informações da pessoa:"+p.toString());
        System.out.println("Informações do livro:"+l.toString());
        
    }
    
}
