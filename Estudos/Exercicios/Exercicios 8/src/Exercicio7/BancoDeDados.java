package Exercicio7;

class BancoDeDados implements AcessoDados {

    public void conectar() {
        System.out.println("Conectado ao banco de dados.");
    }

    public void desconectar() {
        System.out.println("Desconectado do banco de dados.");
    }

    public void inserir(String dados) {
        System.out.println("Dados \"" + dados + "\" inseridos com sucesso no banco de dados.");
    }

    public void atualizar(String dados) {
        System.out.println("Dados \"" + dados + "\" atualizados com sucesso no banco de dados.");
    }

    public void excluir(String dados) {
        System.out.println("Dados \"" + dados + "\" excluídos com sucesso do banco de dados.");
    }
}
