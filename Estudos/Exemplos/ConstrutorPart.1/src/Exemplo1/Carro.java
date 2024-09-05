package Exemplo1;

public class Carro {
	public String  marca;
	public String modelo;
	
	public void alugar() {
		System.out.println("Carro "+marca+" "+modelo+"alugado!");
	}
	
	public void devolver() {
		System.out.println("Carro "+marca+" "+modelo+"devolvido!");
	}
	
	public void exibirDados() {
		System.out.println("Carro: "+marca+"\nmodelo: "+modelo);
	}
	
	public void configuraDados(String marcaCarro,String modeloCarro) {
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	
	public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
	

}
