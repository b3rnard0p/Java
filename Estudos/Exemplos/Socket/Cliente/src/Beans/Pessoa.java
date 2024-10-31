package beans;
import java.io.Serializable;

public class Pessoa implements Serializable {

    private int id;
    private String nome;
    private String sexo;
    private String idioma;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pessoa pessoa = (Pessoa) obj;
        return this.id == pessoa.id;  
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getIdioma() {
        return idioma;
    }

    public String toString() {
        return this.id + " - " + this.nome;
    }

}
