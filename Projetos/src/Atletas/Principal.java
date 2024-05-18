package Trabalho;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    static Set<Atleta> atletas = new HashSet<>(); //Criei o objeto da classe "Atleta" usando hashSet.
    static Scanner scanner = new Scanner(System.in);
    static String ARQUIVO_CSV = "atletas.csv"; //Criei o arquivo CSV.

    public static void main(String[] args) {
        carregarAtletas();
        boolean running = true;
        while (running) {
            System.out.println("Menu");
            System.out.println("1 - Listar atletas(nome ou por pontuação decrescente)");
            System.out.println("2 - Cadastrar atletas");
            System.out.println("3 - Procurar por atletas (nome ou apelido)");
            System.out.println("4 - Remover atleta (nome ou apelido)");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    listarAtletas();
                    break;
                case 2:
                    cadastrarAtleta();
                    break;
                case 3:
                    procurarAtleta();
                    break;
                case 4:
                    removerAtleta();
                    break;
                case 5:
                    running = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
        scanner.close();
    }
    
    static void salvarAtletas() { //Salvando no arquivo CSV.
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO_CSV))) {
            for (Atleta atleta : atletas) {
                writer.println(atleta.toCSV()); 
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
    
    static void carregarAtletas() { //Lendo do arquivo CSV.
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_CSV))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 5) {
                    Atleta atleta = new Atleta(partes[0], partes[1], partes[2], partes[3], Integer.parseInt(partes[4]));
                    atletas.add(atleta);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo CSV: " + e.getMessage());
        }
    }

    private static void listarAtletas() {
        if (atletas.isEmpty()) {
            System.out.println("Não há atletas cadastrados.");
            return;
        }
        System.out.println("Menu de Listagem:");
        System.out.println("1 - Listar por nome");
        System.out.println("2 - Listar por pontuação");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                if (atletas.isEmpty()) {
                    System.out.println("Não há atletas cadastrados.");
                    return;
                }
                System.out.println("Lista de Nomes de Atletas:");
                for (Atleta atleta : atletas) {
                    System.out.println(atleta.getNome());
                }
                break;
            case 2:
                if (atletas.isEmpty()) {
                    System.out.println("Não há atletas cadastrados.");
                    return;
                }
                List<Atleta> listaPontuacao = new ArrayList<>(atletas); //Criei uma lista para passar o hashSet.
                listaPontuacao.sort(Comparator.comparingInt(Atleta::getPontuacaoAcumulada).reversed()); //Ordenei.
                System.out.println("Lista de Atletas (por pontuação decrescente):");
                for (Atleta atleta : listaPontuacao) {
                    System.out.println(atleta.getPontuacaoAcumulada());
                }
                break;
            default:
                System.out.println("Opção inválida. Retornando ao menu principal.");
                break;
        }
    }

    static void cadastrarAtleta() {
        System.out.println("Cadastrar Atleta:");
        System.out.print("Fone: ");
        String fone = scanner.nextLine();
        
        boolean foneExistente = false; //Testando duplicidade.
        for (Atleta atleta : atletas) {
            if (atleta.getFone().equals(fone)) {
                foneExistente = true;
                break;
            }
        }
        
        if (foneExistente) {
            System.out.println("Atleta com esse fone já está cadastrado.");
        } else {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Apelido: ");
            String apelido = scanner.nextLine();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();
            System.out.print("Pontuação Acumulada: ");
            int pontuacaoAcumulada = scanner.nextInt();
            scanner.nextLine(); 
            
            Atleta novoAtleta = new Atleta(fone, nome, apelido, dataNascimento, pontuacaoAcumulada);
            atletas.add(novoAtleta);
            System.out.println("Atleta cadastrado com sucesso.");
            salvarAtletas();
        }
    }


    static void procurarAtleta() {
        System.out.println("Procurar Atleta:");
        System.out.print("Nome ou Apelido: ");
        String busca = scanner.nextLine();
        
        boolean encontrado = false;
        for (Atleta atleta : atletas) {
            if (atleta.getNome().equalsIgnoreCase(busca) || atleta.getApelido().equalsIgnoreCase(busca)) {
                encontrado = true; //Usei equalsIgnoreCase para ignorar letra maiuscula.
                break; 
            }
        }
        
        if (encontrado) {
            System.out.println("Atleta encontrado:");
            for (Atleta atleta : atletas) {
                if (atleta.getNome().equalsIgnoreCase(busca) || atleta.getApelido().equalsIgnoreCase(busca)) {
                    System.out.println(atleta);
                }
            }
        } else {
            System.out.println("Atleta não encontrado.");
        }
    }


    static void removerAtleta() {
        System.out.println("Remover Atleta:");
        System.out.print("Nome ou Apelido: ");
        String busca = scanner.nextLine();
        boolean removido = false;
        Iterator<Atleta> iterator = atletas.iterator();//Usei Iterator para percorrer os atletas.
        while (iterator.hasNext()) {
            Atleta atleta = iterator.next();
            if (atleta.getNome().equalsIgnoreCase(busca) || atleta.getApelido().equalsIgnoreCase(busca)) {
                iterator.remove();
                System.out.println("Atleta removido:");
                System.out.println(atleta);
                removido = true;
            }
        }
        if (!removido) {
            System.out.println("Atleta não encontrado.");
        }
        salvarAtletas();
    }
}
