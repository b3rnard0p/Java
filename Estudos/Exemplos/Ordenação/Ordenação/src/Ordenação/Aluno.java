package Ordenação;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.idade != other.idade) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public int compareTo(Aluno o) {
        if (this.nome.compareTo(o.getNome()) == 0){
            if (this.idade > o.getIdade()){
            return +1;
            }
            return -1;
        }
            
        return this.nome.compareTo(o.getNome());
    }
    
    
}
