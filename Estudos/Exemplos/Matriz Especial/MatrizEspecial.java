import java.util.HashSet;

class Celula {
    int linha;
    int coluna;
    int valor;
    static int qtdLinhas;
    static int qtdColunas;

    public Celula(int linha, int coluna, int valor) {
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
    }

    public String toString() {
        return "Celula [linha=" + linha + ", coluna=" + coluna + ", valor=" + valor + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + linha;
        result = prime * result + coluna;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Celula other = (Celula) obj;
        if (linha != other.linha)
            return false;
        if (coluna != other.coluna)
            return false;
        return true;
    }

    public static void transformaMatrizEmHash(int matriz[][], HashSet<Celula> tabelaHash) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    tabelaHash.add(new Celula(i, j, matriz[i][j]));
                }
            }
        }
        Celula.qtdLinhas = matriz.length;
        Celula.qtdColunas = matriz[0].length;
    }

    public static void transformaHashEmMatriz(HashSet<Celula> tabelaHash, int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }

        for (Celula ponto : tabelaHash) {
            matriz[ponto.linha][ponto.coluna] = ponto.valor;
        }
    }

    public static void exibeMatrizEmHash(HashSet<Celula> tabelaHash) {
        System.out.println("Matriz[" + Celula.qtdLinhas + "][" + Celula.qtdColunas + "]");

        for (Celula ponto : tabelaHash) {
            System.out.println(ponto);
        }
    }
}

public class MatrizEspecial {
    final static int TAML = 10;
    final static int TAMC = 10;

    public static void zerarMatriz(int matriz[][]) {
        for (int i = 0; i < TAML; i++) {
            for (int j = 0; j < TAMC; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < TAML; i++) {
            for (int j = 0; j < TAMC; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matriz[][] = new int[TAML][TAMC];
        zerarMatriz(matriz);
        matriz[0][0] = 100;
        matriz[5][5] = 100;
        matriz[9][9] = 100;

        mostrarMatriz(matriz);

        HashSet<Celula> tabelaHash = new HashSet<Celula>();

        Celula.transformaMatrizEmHash(matriz, tabelaHash);
        Celula.exibeMatrizEmHash(tabelaHash);

        zerarMatriz(matriz);

        Celula.transformaHashEmMatriz(tabelaHash, matriz);

        System.out.println("\nMatriz reconstruída a partir do HashSet:");
        mostrarMatriz(matriz);
    }
}
