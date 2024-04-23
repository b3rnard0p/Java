package Trabalho;
import java.util.Objects;

public class Atleta {
    public String fone;
    public String nome;
    public String apelido;
    public String dataNascimento;
    public int pontuacaoAcumulada;
    
    public String toCSV() {
        return fone + "; " + nome + "; " + apelido + "; " + dataNascimento + "; " + pontuacaoAcumulada;
    } //O modo como vai ficar salvo no arquivo.

    public Atleta(String fone, String nome, String apelido, String dataNascimento, int pontuacaoAcumulada) {
        this.fone = fone;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPontuacaoAcumulada() {
        return pontuacaoAcumulada;
    }

    public void setPontuacaoAcumulada(int pontuacaoAcumulada) {
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    public String toString() {
        return "Atleta{" +
                "fone='" + fone + '\'' +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", pontuacaoAcumulada=" + pontuacaoAcumulada +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return Objects.equals(fone, atleta.fone);
    }

    public int hashCode() {
        return Objects.hash(fone);
    }
}
