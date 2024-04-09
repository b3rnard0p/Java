package Exercicio5;

public class Computador {
	 public String marca;
	 public String modelo;
	 public String sistemaOperacional;

	    public Computador(String marca, String modelo, String sistemaOperacional) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.sistemaOperacional = sistemaOperacional;
	        System.out.println("Marca do computador: " + marca);
	        System.out.println("Modelo do computador: " + modelo);
	        System.out.println("Sistema operacional do computador: " + sistemaOperacional);
	    }

	    public Computador(String marca) {
	        this.marca = marca;
	        System.out.println("Marca do computador: " + marca);
	    }
}
