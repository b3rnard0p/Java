package Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
      
//        Aluno a1 = new Aluno("Alex", 16);
//        Aluno a2 = new Aluno("Alex", 50);
//        
//        System.out.println(a1.compareTo(a2));

        ArrayList<Aluno> lista = new ArrayList<>();
        
        //lista.add(6);
        //lista.add(3);
        //lista.add(1);
        
        lista.add(new Aluno("Gabriel",23));
        lista.add(new Aluno("Gabriel",21));
        lista.add(new Aluno("Gabriel",12));
        lista.add(new Aluno("Alexandre",50));
        lista.add(new Aluno("Pedro",23));
        lista.add(new Aluno("Gabriel",13));
        
        Aluno a = new Aluno("Alexandre",50);
        
        if(!lista.contains(a)){
            lista.add(a);
        }
        
        //Versão moderna de ordenação:
        //lista.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getIdade));
        
        //Versão tradicional A de ordenação:
        //Collections.sort(lista);
        
        //Versão tradicional B de ordenação:
        //Collections.sort(lista, Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getIdade));
        
        //lista.sort(null);
        
        //Ordenacao.bolha(lista);
        
        for (Aluno item : lista) {
            System.out.println(item);
        }
    }
}
