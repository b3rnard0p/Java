package Componentes;

import javax.swing.JOptionPane;

public class CheckBox extends javax.swing.JFrame {

    public CheckBox() {
        initComponents();
    }

    private char sexo;
    boolean astronomia, tecnologia, esportes;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jblInteresse = new javax.swing.JLabel();
        chkTec = new javax.swing.JCheckBox();
        chkAst = new javax.swing.JCheckBox();
        chkEs = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jblInteresse.setText("Interesses:");

        chkTec.setText("Tecnologia");

        chkAst.setText("Astronomia");

        chkEs.setText("Esportes");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblInteresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAst)
                        .addGap(18, 18, 18)
                        .addComponent(chkEs))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnSalvar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblInteresse, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTec)
                    .addComponent(chkAst)
                    .addComponent(chkEs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        tecnologia = chkTec.isSelected();
        astronomia = chkAst.isSelected();
        esportes = chkEs.isSelected();
        JOptionPane.showMessageDialog(null, "Tecnologia: "+tecnologia+"\nAstronomia: "+astronomia+"\nEsportes: "+esportes,"Alerta",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkAst;
    private javax.swing.JCheckBox chkEs;
    private javax.swing.JCheckBox chkTec;
    private javax.swing.JLabel jblInteresse;
    // End of variables declaration//GEN-END:variables
}
