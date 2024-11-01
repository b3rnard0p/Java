package beans;

import beans.Pessoa;
import dao.PessoaDAO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ThreadServer extends Thread {
    private Socket clienteSocket;

    public ThreadServer(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }
    
    public void run(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());
        
            int id = in.readInt();
            System.out.println("ID recebido: " + id);
        
            PessoaDAO pDAO = new PessoaDAO();
            Pessoa p = pDAO.getPessoa(id);

            out.writeObject(p);
        } catch (IOException ex) {
            System.out.println("Erro ao aceitar conexão do cliente");
         }
    }
    
}
