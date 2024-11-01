package Interfaces;

import beans.Pessoa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consulta extends javax.swing.JFrame {

    public Consulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblCodigoP = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jblSexo = new javax.swing.JLabel();
        jblIdioma = new javax.swing.JLabel();
        jblResuNome = new javax.swing.JLabel();
        jblResuSexo = new javax.swing.JLabel();
        jblResuIdioma = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jblConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jblCodigoP.setText("Código da Pessoa:");

        jblNome.setText("Nome:");

        jblSexo.setText("Sexo:");

        jblIdioma.setText("Idioma:");

        jblResuNome.setText("Resultado");

        jblResuSexo.setText("Resultado");

        jblResuIdioma.setText("Resultado");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jblConsulta.setText("Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblNome)
                                    .addComponent(jblSexo)
                                    .addComponent(jblIdioma))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblResuIdioma)
                                    .addComponent(jblResuSexo)
                                    .addComponent(jblResuNome)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblCodigoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jblConsulta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblConsulta)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoP)
                    .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNome)
                    .addComponent(jblResuNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblSexo)
                    .addComponent(jblResuSexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdioma)
                    .addComponent(jblResuIdioma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
try{
            String host = "localhost";
            int porta = 12345;
            
            Socket clienteSocket = new Socket(host,porta);
            System.out.println("Conexão efetuda com sucesso!");
            
            ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());
            
            int id = Integer.parseInt(txtCodigoP.getText());
            out.writeInt(id);
            out.flush();
            
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Resposta: " + p.getNome());
            
            jblResuNome.setText(p.getNome());
            jblResuSexo.setText(p.getSexo());
            jblResuIdioma.setText(p.getSexo());
            
            out.close();
            in.close();
            clienteSocket.close();

        } catch (IOException ex) {
            System.out.println("Erro na comunicação com o servidor");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe Pessoa não encontrada");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jblCodigoP;
    private javax.swing.JLabel jblConsulta;
    private javax.swing.JLabel jblIdioma;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jblResuIdioma;
    private javax.swing.JLabel jblResuNome;
    private javax.swing.JLabel jblResuSexo;
    private javax.swing.JLabel jblSexo;
    private javax.swing.JTextField txtCodigoP;
    // End of variables declaration//GEN-END:variables
}
