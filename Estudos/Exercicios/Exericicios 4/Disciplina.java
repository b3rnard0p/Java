import java.util.Scanner;

public class Disciplina {
    public String nome;
    public int cargaHoraria;
    public String nomeProfessor;

    public Disciplina(String nome, int cargaHoraria, String nomeProfessor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nomeProfessor = nomeProfessor;
    }

    public void atribuirValores(String nome, int cargaHoraria, String nomeProfessor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nomeProfessor = nomeProfessor;
    }

    public void exibirValores() {
        System.out.println("Nome da disciplina: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
        System.out.println("Nome do professor: " + nomeProfessor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina:");
        String nome = scanner.nextLine();

        System.out.println("Digite a carga horária da disciplina:");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o nome do professor:");
        String nomeProfessor = scanner.nextLine();

        Disciplina disciplina = new Disciplina(nome, cargaHoraria, nomeProfessor);

        System.out.println("\nConteúdo original:");
        disciplina.exibirValores();

        System.out.println("\nInsira os novos valores:");

        System.out.println("Digite o novo nome da disciplina:");
        nome = scanner.nextLine();

        System.out.println("Digite a nova carga horária da disciplina:");
        cargaHoraria = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o novo nome do professor:");
        nomeProfessor = scanner.nextLine();

        disciplina.atribuirValores(nome, cargaHoraria, nomeProfessor);

        System.out.println("\nNovo conteúdo:");
        disciplina.exibirValores();

        scanner.close();
    }
}
