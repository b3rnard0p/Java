package Revisão;

public class Professor extends Usuario {
    private String matricula;
    private String areaFormacao;
    private String alocacaoCurso;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getAlocacaoCurso() {
        return alocacaoCurso;
    }

    public void setAlocacaoCurso(String alocacaoCurso) {
        this.alocacaoCurso = alocacaoCurso;
    }

    @Override
    public void executaAcao() {
        System.out.println("O professor " + getNomeCompleto() + " foi inserido");
    }
}

    

