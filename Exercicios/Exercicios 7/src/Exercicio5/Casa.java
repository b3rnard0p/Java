package Exercicio5;

public class Casa {
    public int precopormetro = 1000;
    public int precoporquarto = 5000; 

    public int calcularPreco(int tamanho) {
        return tamanho * precopormetro;
    }

    public int calcularPreco(int tamanho, int numQuartos) {
        return (tamanho * precopormetro) + (numQuartos * precoporquarto);
    }
}
