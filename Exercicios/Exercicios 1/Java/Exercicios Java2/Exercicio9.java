package Exercicio9;

public class Exercicio9 {
    public static void main(String[] args) {
        int numero = 2;
        
        do {
            int contador = 0;
            for (int i = 1; i != numero; i++) {
                if (numero%i==0){
                    contador++;
                }
            }
    
            if (contador == 1){
                System.out.println(numero);
            }
    
            numero++;

        } while (numero<=50);
        
    }
}
