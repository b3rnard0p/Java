package Projeto4;

public class Carro {
    public String marca;
    public String modelo;
    
   public Carro(String marca, String modelo){
       this.marca = marca;
       this.modelo = modelo;
   }
   
     public Carro(String marca){
       this.marca = marca;
   }

    
   public void alugar(){
       System.out.println("Alugado: ");
       System.out.println("Marca :"+this.marca);
       System.out.println("Modelo: "+this.modelo);
   }
   
   public void devolver(){
       System.out.println("Devolvido: ");
       System.out.println("Marca :"+this.marca);
       System.out.println("Modelo: "+this.modelo);
   }
   
   public void exibirDados(){
       System.out.println("Exibindo dados: ");
       System.out.println("Marca :"+this.marca);
       System.out.println("Modelo: "+this.modelo);
   }
   
   public void configuraDados(String marca, String modelo){
       this.marca = marca;
       this.modelo = modelo;
   }
   
   public String retornaMarca(){
       return this.marca;
   }
   
    public String retornaModelo(){
       return this.modelo;
   }
    
}
