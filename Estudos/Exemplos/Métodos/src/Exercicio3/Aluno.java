package Exercicio3;
public class Aluno {
    public String nome;
    public String matricula;
    public String dataNascimento;
    public int anoIngresso;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "2021001");
        Aluno aluno2 = new Aluno("01/01/2000");
        Aluno aluno3 = new Aluno("Maria", "10/05/1999", 2021);

        System.out.println("Informações do Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println();

        System.out.println("Informações do Aluno 2:");
        System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
        System.out.println();

        System.out.println("Informações do Aluno 3:");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Data de Nascimento: " + aluno3.getDataNascimento());
        System.out.println("Ano de Ingresso na Faculdade: " + aluno3.getAnoIngresso());
    }
}
