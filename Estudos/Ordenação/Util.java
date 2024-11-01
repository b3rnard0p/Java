package ordenação;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Util {
    public static void gerarPalavrasArquivo(String nomeArquivo, int quantidade, int tamanho) {
        try (FileWriter arquivo = new FileWriter(nomeArquivo)) {
            for (int i = 0; i < quantidade; i++) {
                arquivo.write(gerarPalavra(tamanho) + "\n");
            }
            System.out.println("As palavras foram salvas em " + nomeArquivo + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void gerarNumerosArquivo(String nomeArquivo, int quantidade, int tamanho) {
        try (FileWriter arquivo = new FileWriter(nomeArquivo)) {
            for (int i = 0; i < quantidade; i++) {
                arquivo.write(Integer.toString(new Random().nextInt(tamanho)) + "\n");
            }
            System.out.println("Os números foram salvos em " + nomeArquivo + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void gerarNumerosLista(List<Integer> lista, int quantidade, int tamanho) {
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(random.nextInt(tamanho));
        }
    }

    public static String gerarPalavra(int tamanho) {
        String letras = "abcdefghijklmnopqrstuvwxyz ";
        StringBuilder palavra = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            char letraSorteada = letras.charAt(random.nextInt(letras.length()));
            palavra.append(letraSorteada);
        }

        return palavra.toString();
    }

    public static void gerarPalavrasLista(List<String> lista, int quantidade, int tamanho) {
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerarPalavra(tamanho));
        }
    }

    public static void exibir(List<?> lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
    }
    
}
