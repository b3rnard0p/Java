import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String email;
    private String dataNascimento;
    private String endereco;
    private boolean admin;

    public Pessoa(String nome, String email, String dataNascimento, String endereco, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void promoverAdmin() {
        admin = true;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String toString() {
        String info = "Nome: " + nome + "\n" +
                      "Email: " + email + "\n" +
                      "Data de Nascimento: " + dataNascimento + "\n" +
                      "Endereço: " + endereco + "\n" +
                      "Admin: " + (admin ? "Sim" : "Não");
        return info;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro da primeira pessoa:");

        System.out.println("Digite o nome da pessoa:");
        String nome1 = scanner.nextLine();

        System.out.println("Digite o email da pessoa:");
        String email1 = scanner.nextLine();

        System.out.println("Digite a data de nascimento da pessoa:");
        String dataNascimento1 = scanner.nextLine();

        System.out.println("Digite o endereço da pessoa:");
        String endereco1 = scanner.nextLine();

        Pessoa pessoa1 = new Pessoa(nome1, email1, dataNascimento1, endereco1, false);

        System.out.println("\nCadastro da segunda pessoa:");

        System.out.println("Digite o nome da pessoa:");
        String nome2 = scanner.nextLine();

        System.out.println("Digite o email da pessoa:");
        String email2 = scanner.nextLine();

        System.out.println("Digite a data de nascimento da pessoa:");
        String dataNascimento2 = scanner.nextLine();

        System.out.println("Digite o endereço da pessoa:");
        String endereco2 = scanner.nextLine();

        Pessoa pessoa2 = new Pessoa(nome2, email2, dataNascimento2, endereco2, false);

        System.out.println("\nEscolha uma pessoa para promover a administrador (1 ou 2):");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        if (escolha == 1) {
            pessoa1.promoverAdmin();
            System.out.println(pessoa1.nome + " foi promovido a administrador!");
        } else if (escolha == 2) {
            pessoa2.promoverAdmin();
            System.out.println(pessoa2.nome + " foi promovido a administrador!");
        } else {
            System.out.println("Escolha inválida.");
        }

        System.out.println("\nLista das pessoas cadastradas:");
        System.out.println("Pessoa 1:");
        System.out.println(pessoa1.toString());
        System.out.println();
        System.out.println("Pessoa 2:");
        System.out.println(pessoa2.toString());

        scanner.close();
    }
}
