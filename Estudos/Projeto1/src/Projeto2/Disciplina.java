package Projeto2;

public class Disciplina {
    
    public static void main(String[] args) {
        
        Professor p = new Professor();
        Laboratorio l = new Laboratorio();
        
        p.nome = "Bernardo";
        l.local = "Sala 108";
        
        System.out.println("O nome do professor: "+p.nome);
        System.out.println("O local da aula: "+l.local);

    }
    
}
