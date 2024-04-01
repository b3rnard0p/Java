import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Trabalho {
    public static void main(String[] args) {
        int N = 10; // Número de listas
        int M = 5; // Tamanho das listas
        List<List<Integer>> listas = new ArrayList<>();

        // Criar e preencher as listas com números aleatórios
        for (int i = 0; i < N; ++i) {
            listas.add(criarListaOrdenada(M));
        }

        // Exibir as 10 listas
        System.out.println("Listas:");
        for (int i = 0; i < N; ++i) {
            System.out.println("Lista " + (i + 1) + ": " + listas.get(i));
        }

        // Encontrar números comuns e únicos
        Set<Integer> numerosComuns = new HashSet<>();
        Set<Integer> numerosUnicos = new HashSet<>();
        for (int num = 1; num <= 100; ++num) {
            int count = 0;
            for (List<Integer> lista : listas) {
                if (lista.contains(num)) {
                    count++;
                }
            }
            if (count == N) {
                numerosComuns.add(num);
            } else if (count == 1) {
                numerosUnicos.add(num);
            }
        }

        // Exibir resultados
        System.out.println("\nNúmeros comuns em todas as listas: " + numerosComuns);
        System.out.println("Números únicos em apenas uma das listas: " + numerosUnicos);
    }

    // Função para criar uma lista aleatória ordenada com M elementos
    private static List<Integer> criarListaOrdenada(int M) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < M; ++i) {
            lista.add(random.nextInt(100) + 1);
        }
        lista.sort(null); // Ordenar a lista
        return lista;
    }
}
