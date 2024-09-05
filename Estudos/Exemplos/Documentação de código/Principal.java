import java.util.ArrayList;

public class Principal{
    public static void main(String a[]){
        ArrayList<Integer> lista = new ArrayList<>();

        Numeros.popularAleatorio(lista, 100, 1000);

        Numeros.exibir(lista);
    }
}