import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Personagem {
    private String nome;
    private int energia;
    private String categoria;

    public Personagem(String nome, int energia, String categoria) {
        this.nome = nome;
        this.energia = energia;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public String getCategoria() {
        return categoria;
    }
}

public class Atividade {

    public static void main(String[] args) {
        ArrayList<Personagem> personagens = carregarDoCSV();

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Personagem");
            System.out.println("2. Listar Personagens");
            System.out.println("3. Remover Personagem");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do personagem: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a energia do personagem: ");
                    int energia = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a categoria do personagem: ");
                    String categoria = scanner.nextLine();
                    Personagem novoPersonagem = new Personagem(nome, energia, categoria);
                    personagens.add(novoPersonagem);
                    salvarNoCSV(personagens);
                    System.out.println("Personagem cadastrado com sucesso!");
                    break;
                case 2:
                    if (personagens.isEmpty()) {
                        System.out.println("Não há personagens cadastrados.");
                    } else {
                        System.out.println("Lista de Personagens:");
                        for (Personagem personagem : personagens) {
                            System.out.println("Nome: " + personagem.getNome() + ", Energia: " +
                                    personagem.getEnergia() + ", Categoria: " + personagem.getCategoria());
                        }
                    }
                    break;
                case 3:
                    if (personagens.isEmpty()) {
                        System.out.println("Não há personagens cadastrados para remover.");
                    } else {
                        scanner.nextLine(); // Limpar o buffer
                        System.out.print("Digite o nome do personagem que deseja remover: ");
                        String nomeRemover = scanner.nextLine();
                        boolean removido = false;
                        for (Personagem personagem : personagens) {
                            if (personagem.getNome().equalsIgnoreCase(nomeRemover)) {
                                personagens.remove(personagem);
                                removido = true;
                                System.out.println("Personagem removido com sucesso!");
                                salvarNoCSV(personagens);
                                break;
                            }
                        }
                        if (!removido) {
                            System.out.println("Personagem não encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static ArrayList<Personagem> carregarDoCSV() {
        ArrayList<Personagem> personagens = new ArrayList<>();
        try {
            File arquivo = new File("personagens.csv");
            if (arquivo.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(arquivo));
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] partes = linha.split(",");
                    String nome = partes[0];
                    int energia = Integer.parseInt(partes[1]);
                    String categoria = partes[2];
                    Personagem personagem = new Personagem(nome, energia, categoria);
                    personagens.add(personagem);
                }
                reader.close();
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar do arquivo CSV: " + e.getMessage());
        }
        return personagens;
    }

    public static void salvarNoCSV(ArrayList<Personagem> personagens) {
        try {
            FileWriter writer = new FileWriter("personagens.csv");
            for (Personagem personagem : personagens) {
                writer.append(personagem.getNome());
                writer.append(",");
                writer.append(String.valueOf(personagem.getEnergia()));
                writer.append(",");
                writer.append(personagem.getCategoria());
                writer.append("\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo CSV: " + e.getMessage());
        }
    }
}
