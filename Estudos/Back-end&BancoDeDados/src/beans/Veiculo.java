package beans;

public class Veiculo {
    private int id;
    private String modelo;
    private String placa;
    private Pessoa pessoaid;

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public Pessoa getPessoaid() {
        return pessoaid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPessoaid(Pessoa pessoaid) {
        this.pessoaid = pessoaid;
    }     
}
