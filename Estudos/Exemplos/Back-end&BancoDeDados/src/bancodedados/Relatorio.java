package bancodedados;

import beans.Pessoa;
import dao.PessoaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Relatorio extends javax.swing.JFrame {

    public Relatorio() {
        initComponents();
        preencheTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnt_GrpSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoas = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        jblNome = new javax.swing.JLabel();
        rdoMasc = new javax.swing.JRadioButton();
        rdoFemi = new javax.swing.JRadioButton();
        jblSexo = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Relatório das Pessoas");

        tblPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sexo", "Idioma"
            }
        ));
        jScrollPane1.setViewportView(tblPessoas);

        txtNome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomeCaretUpdate(evt);
            }
        });

        jblNome.setText("Nome:");

        bnt_GrpSexo.add(rdoMasc);
        rdoMasc.setText("Masculino");
        rdoMasc.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoMascStateChanged(evt);
            }
        });

        bnt_GrpSexo.add(rdoFemi);
        rdoFemi.setText("Feminino");
        rdoFemi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoFemiStateChanged(evt);
            }
        });

        jblSexo.setText("Sexo:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblNome)
                    .addComponent(jblSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoMasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoFemi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoMasc)
                    .addComponent(rdoFemi)
                    .addComponent(jblSexo)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomeCaretUpdate
        preencheTabela();
    }//GEN-LAST:event_txtNomeCaretUpdate

    private void rdoMascStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoMascStateChanged
        preencheTabela();
    }//GEN-LAST:event_rdoMascStateChanged

    private void rdoFemiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoFemiStateChanged
        preencheTabela();
    }//GEN-LAST:event_rdoFemiStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        bnt_GrpSexo.clearSelection();
    }//GEN-LAST:event_btnLimparActionPerformed

    public void preencheTabela(){
        String sexo = "";
        PessoaDAO pDAO = new PessoaDAO();
        //List<Pessoa> listaPessoas = pDAO.getPessoas();
        
        if(rdoMasc.isSelected()){
            sexo = "M";
        } else if(rdoFemi.isSelected()){
            sexo = "F"; 
        }
        
        List<Pessoa> listaPessoas = pDAO.getPessoasNomeeSexo(txtNome.getText(), sexo);
        DefaultTableModel tabelaPessoas = (DefaultTableModel) tblPessoas.getModel();
        
        tabelaPessoas.setNumRows(0);
        
        for(Pessoa p : listaPessoas){
            Object[] obj = new Object[]{
                p.getId(),
                p.getNome(),
                p.getSexo(),
                p.getIdioma()};
            tabelaPessoas.addRow(obj);
        }  
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bnt_GrpSexo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jblSexo;
    private javax.swing.JRadioButton rdoFemi;
    private javax.swing.JRadioButton rdoMasc;
    private javax.swing.JTable tblPessoas;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
