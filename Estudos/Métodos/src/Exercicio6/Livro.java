package Exercicio6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;
    public String genero;
    public boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.emprestado = false; 
    }

    public String informacoesLivro() {
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Ano de publicação: " + anoPublicacao + "\n" +
               "Gênero: " + genero + "\n" +
               "Emprestado: " + (emprestado ? "Sim" : "Não");
    }

    public void emprestarLivro() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolverLivro() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar um novo livro");
            System.out.println("2. Listar livros cadastrados");
            System.out.println("3. Emprestar ou devolver um livro");
            System.out.println("4. Sair do sistema");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();

                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();

                    System.out.println("Digite o ano de publicação do livro:");
                    int anoPublicacao = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o gênero do livro:");
                    String genero = scanner.nextLine();

                    Livro livro = new Livro(titulo, autor, anoPublicacao, genero);
                    biblioteca.add(livro);

                    System.out.println("\nLivro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de livros cadastrados:");
                    for (int i = 0; i < biblioteca.size(); i++) {
                        System.out.println("Livro " + (i + 1) + ":");
                        System.out.println(biblioteca.get(i).informacoesLivro());
                        System.out.println();
                    }
                    break;

                case 3:
                    if (biblioteca.isEmpty()) {
                        System.out.println("Não há livros cadastrados.");
                        break;
                    }

                    System.out.println("\nLista de livros cadastrados:");
                    for (int i = 0; i < biblioteca.size(); i++) {
                        System.out.println("Livro " + (i + 1) + ":");
                        System.out.println(biblioteca.get(i).informacoesLivro());
                        System.out.println();
                    }

                    System.out.println("Digite o número do livro que deseja emprestar ou devolver:");
                    int numLivro = scanner.nextInt();
                    scanner.nextLine();

                    if (numLivro > 0 && numLivro <= biblioteca.size()) {
                        Livro livroSelecionado = biblioteca.get(numLivro - 1);
                        System.out.println("\nVocê selecionou o seguinte livro:");
                        System.out.println(livroSelecionado.informacoesLivro());

                        System.out.println("\nDeseja emprestar (E) ou devolver (D) este livro?");
                        String escolha = scanner.nextLine().toUpperCase();

                        if (escolha.equals("E")) {
                            livroSelecionado.emprestarLivro();
                        } else if (escolha.equals("D")) {
                            livroSelecionado.devolverLivro();
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Número de livro inválido.");
                    }
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
