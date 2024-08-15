package ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaBolha = new ArrayList<>();

        Util.gerarNumerosLista(lista, 10000, 10000);
        Util.gerarNumerosLista(listaBolha, 10000, 10000);

        new Thread(() -> {
            System.out.println("Ordenando a lista para o bolha...");
            Ordenacao.bolha(listaBolha);
            System.out.println("feito... com bolha");
        }).start();

        new Thread(() -> {
            System.out.println("Ordenando a lista para o sort...");
            Collections.sort(lista);
            System.out.println("feito... sort Java");
        }).start();
    }
            
            
    
}
