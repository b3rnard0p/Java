package bancodedados;

import beans.Pessoa;
import dao.PessoaDAO;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp_Sexo = new javax.swing.ButtonGroup();
        jblCadastro = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jblSexo = new javax.swing.JLabel();
        jblIdioma = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        rdoMasc = new javax.swing.JRadioButton();
        rdoFemi = new javax.swing.JRadioButton();
        cmbIdioma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jblCadastro.setText("Cadastro");

        jblNome.setText("Nome:");

        jblSexo.setText("Sexo:");

        jblIdioma.setText("Idioma:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnGrp_Sexo.add(rdoMasc);
        rdoMasc.setText("Masculino");
        rdoMasc.setToolTipText("");

        btnGrp_Sexo.add(rdoFemi);
        rdoFemi.setText("Feminino");

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Italiano", "Inglês", "Espanhol", "Holândes" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoMasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoFemi))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblIdioma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jblCadastro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Pessoa p = new Pessoa();
        p.setNome(txtNome.getText());
        p.setSexo(rdoMasc.isSelected() ? "M" : "F");
        p.setIdioma((String) cmbIdioma.getSelectedItem());
       
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup btnGrp_Sexo;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JLabel jblCadastro;
    private javax.swing.JLabel jblIdioma;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jblSexo;
    private javax.swing.JRadioButton rdoFemi;
    private javax.swing.JRadioButton rdoMasc;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
