package Exercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
    	
    	//FileNotFoundException: Esta exceção é lançada quando um arquivo solicitado não é encontrado 
    	//no sistema de arquivos. É comumente encontrada ao tentar abrir um arquivo 
    	//para leitura ou gravação que não existe.
    	
        try {
            File file = new File("arquivo.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
            e.printStackTrace();
        }
    }
}
