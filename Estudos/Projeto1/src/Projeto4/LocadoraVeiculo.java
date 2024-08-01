package Projeto4;

import java.util.Scanner;

public class LocadoraVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Carro c = new Carro();
        
        //System.out.println("Digite a marca do carro: ");
        //c.marca = sc.nextLine();
        
        //System.out.println("Digite o modelo do carro: ");
        //c.modelo = sc.nextLine();
        //c.exibirDados();
        
        //String marca, modelo;
        
        //System.out.println("Digite a marca do carro: ");
        //marca = sc.nextLine();
        
        //System.out.println("Digite o modelo do carro: ");
        //modelo = sc.nextLine();
        
        //Carro c = new Carro(marca, modelo);
        
        String marca;
        marca = "VW";
        Carro c2 = new Carro(marca);
        System.out.println("Marca do carro 2:"+c2.marca);
        
        //c.configuraDados(marca, modelo);
        //c.exibirDados();
        
        //System.out.println("Marca: "+c.retornaMarca());
        //System.out.println("Modelo: "+c.retornaModelo());
        
        
    }
    
}
