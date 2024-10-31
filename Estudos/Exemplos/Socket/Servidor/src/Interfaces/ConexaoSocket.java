package Interfaces;

import beans.ThreadServer;
import beans.Pessoa;
import dao.PessoaDAO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexaoSocket {

    public static void main(String[] args) {
        int porta = 12345;

        try (ServerSocket servidorSocket = new ServerSocket(porta)) {
            System.out.println("Servidor aguardando conexões na porta " + porta);

            while (true) {
                try {
                    Socket clienteSocket = servidorSocket.accept();
                    System.out.println("Conexão aceita de " + clienteSocket.getInetAddress());
                    
                    Thread threadCliente = new ThreadServer(clienteSocket);
                    threadCliente.start();
                    
                    
                } catch (IOException ex) {
                    System.out.println("Erro ao aceitar conexão do cliente");
                }
            }

        } catch (IOException ex) {
            System.out.println("Erro ao criar o ServerSocket");
        }

    }
}
