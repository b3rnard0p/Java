package projeto1;

public class Projeto1 {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        p1.idade = 10;
        p2.idade = 50;
        p3.idade = 19;
        
        p.nome = "Ricardo";
        p.idade = 39;
        p.email = "ricardo@frohlich.ufn.br";
        
        //System.out.println("Dados da pessoa: "+p.toString());
        
        System.out.println("Idade da pessoa 1: "+p1.idade);
        System.out.println("Idade da pessoa 2: "+p2.idade);
        System.out.println("Idade da pessoa 3: "+p3.idade);
        
                
    }
    
}
