package Exercicio4;

public class Principal {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setNome("Rex");
        c.setIdade(5);
        c.emiteSom();
        c.cuidarPatio();
        c.exibeDados();

        Animal cachorro = new Cachorro();
        ((Cachorro) cachorro).setNome("Buddy");
        ((Cachorro) cachorro).setIdade(3);
        cachorro.emiteSom();
        ((Cachorro) cachorro).exibeDados();

        Animal gato = new Gato();
        ((Gato) gato).setNome("Mimi");
        ((Gato) gato).setIdade(2);
        gato.emiteSom();
        ((Gato) gato).exibeDados();
    }
}
