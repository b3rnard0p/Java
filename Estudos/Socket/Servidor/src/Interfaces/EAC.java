package Interfaces;

import beans.Pessoa;
import dao.PessoaDAO;
import javax.swing.JOptionPane;

public class EAC extends javax.swing.JFrame {

    public EAC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_GrpSexo = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jblTitulo = new javax.swing.JLabel();
        jblId = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jblSexo = new javax.swing.JLabel();
        jblIdioma = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jblId2 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        txtId2 = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        rdoMasc = new javax.swing.JRadioButton();
        rdoFemi = new javax.swing.JRadioButton();
        cmbIdioma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jblTitulo.setText("Consultar, Editar e Excluir");

        jblId.setText("ID:");

        jblNome.setText("Nome:");

        jblSexo.setText("Sexo:");

        jblIdioma.setText("Idioma:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jblId2.setText("ID:");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        txtId2.setEnabled(false);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btn_GrpSexo.add(rdoMasc);
        rdoMasc.setText("Masculino");

        btn_GrpSexo.add(rdoFemi);
        rdoFemi.setText("Feminino");

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português ", "Italiano", "Inglês", "Espanhol", "Holândes" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jblId2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jblIdioma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoMasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoFemi))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblId2)
                    .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblSexo)
                    .addComponent(rdoMasc)
                    .addComponent(rdoFemi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdioma)
                    .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    int idPessoa = Integer.parseInt(txtId.getText());
    PessoaDAO pDAO = new PessoaDAO();
    
    Pessoa p = pDAO.getPessoa(idPessoa);
    
    if(p==null){
     limparFormulario();
     JOptionPane.showMessageDialog(this, "Pessoa não encontrada");
    } 
    else
     txtId2.setText(idPessoa+"");
     txtNome.setText(p.getNome());
     if(p.getSexo().equalsIgnoreCase("M")){
         rdoMasc.setSelected(true);
     } else {
         rdoFemi.setSelected(true);
     }
     cmbIdioma.setSelectedItem(p.getIdioma());
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
     String sexo = null;
     if(rdoMasc.isSelected()){
         sexo = "M";
     } else if(rdoFemi.isSelected()){
         sexo = "F";
     }
     Pessoa p = new Pessoa();
     p.setId(Integer.parseInt(txtId2.getText()));
     p.setNome(txtNome.getText());
     p.setSexo(sexo);
     p.setIdioma(cmbIdioma.getSelectedItem().toString());
     
     PessoaDAO pDAO = new PessoaDAO();
     pDAO.editar(p);
     limparFormulario();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
     int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Exclusão", JOptionPane.YES_NO_OPTION);
    
     if(resposta == JOptionPane.YES_OPTION){
         PessoaDAO pDAO = new PessoaDAO();
         pDAO.excluir(Integer.parseInt(txtId2.getText()));
         limparFormulario();
     }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void limparFormulario(){
    txtId.setText("");
    txtNome.setText("");
    btn_GrpSexo.clearSelection();
    cmbIdioma.setSelectedIndex(0);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btn_GrpSexo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JLabel jblId;
    private javax.swing.JLabel jblId2;
    private javax.swing.JLabel jblIdioma;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jblSexo;
    private javax.swing.JLabel jblTitulo;
    private javax.swing.JRadioButton rdoFemi;
    private javax.swing.JRadioButton rdoMasc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
