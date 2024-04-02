public class RealizaConta {
    public static double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public static double divisao(double valor1, double valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN; // Retorna NaN (Not a Number) em caso de divisão por zero
        }
    }

    public static double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }
}