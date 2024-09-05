package Componentes;

public class Pessoa {
    public String nome;
    public char sexo;
    public String idioma;
    
    public Pessoa(String nome, char sexo, String idioma){
        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;           
    }
    
    public Object[] obterDados(){
        return new Object[]{nome, sexo, idioma};
    }
    
}
