package pkg;

public class Carro {
    public String marca;
    public String modelo;
    
    
    public Carro(String modeloCarro) {
    	modelo = modeloCarro;
    }
    
    public Carro(String modeloCarro, String marcaCarro) {
    	modelo = modeloCarro;
    	marca = marcaCarro;
    }
    
    public void exibirDados() {
    	System.out.println("Carro:"+marca+"\nModelo"+modelo);
    }
}
