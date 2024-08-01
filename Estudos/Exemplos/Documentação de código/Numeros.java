import java.util.ArrayList;
import java.util.Random;

/**
 * Classe com métodos estáticos para manipular listas de números 
 */

public class Numeros {

/**
 * método estático que popula uma lista com números inteiros e aleatório num range passado
 * @param lista - lista com números inteiros
 * @param quantidade - quantidade de numeros
 * @param limite - range de limite
 */

    public static void popularAleatorio(ArrayList lista, int qtd, int limite){
        Random gerador = new Random();
        for(int i; i < qtd; i++){
            lista.add(gerador.nextInt(limite));
        }
    }
}
