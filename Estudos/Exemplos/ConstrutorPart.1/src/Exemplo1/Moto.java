package Exemplo1;

public class Moto {
  public String marca;
  public String modelo;
  public String cilindradas;
  
  public void atribuir(String marcaMoto,String modeloMoto, String cilindradasMoto ) {
	  marca = marcaMoto;
	  modelo = modeloMoto;
	  cilindradas = cilindradasMoto;
  }
  
  public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
	
	public String retornaCilindradas() {
		return cilindradas;
	}
	
	
}
