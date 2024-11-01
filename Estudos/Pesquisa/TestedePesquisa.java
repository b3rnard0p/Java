import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestedePesquisa {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80000; i++) {
            numeros.add(random.nextInt(1000000));
        }

        Collections.sort(numeros);

        int valorProcurado = 1000001;

        long inicio = System.nanoTime();
        boolean encontradoContains = pesquisaContains(numeros, valorProcurado);
        long tempoContains = System.nanoTime() - inicio;
        System.out.println("Contains encontrou? " + encontradoContains + ". Tempo: " + tempoContains);

        inicio = System.nanoTime();
        boolean encontradoIndexOf = pesquisaIndexOf(numeros, valorProcurado);
        long tempoIndexOf = System.nanoTime() - inicio;
        System.out.println("indexOf encontrou? " + encontradoIndexOf + ". Tempo: " + tempoIndexOf);

        inicio = System.nanoTime();
        boolean encontradoBinaria = pesquisaBinaria(numeros, valorProcurado);
        long tempoBinaria = System.nanoTime() - inicio;
        System.out.println("Binária encontrou? " + encontradoBinaria + ". Tempo: " + tempoBinaria);
    }

    public static boolean pesquisaContains(List<Integer> numeros, int valor) {
        return numeros.contains(valor);
    }

    public static boolean pesquisaIndexOf(List<Integer> numeros, int valor) {
        return numeros.indexOf(valor) != -1;
    }

    public static boolean pesquisaBinaria(List<Integer> numeros, int valor) {
        int ini = 0;
        int fim = numeros.size() - 1;
        int meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;

            if (valor == numeros.get(meio)) {
                return true;
            }
            if (valor < numeros.get(meio)) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return false;
    }
}
