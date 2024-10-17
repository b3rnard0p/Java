package bancodedados;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JMenuBar();
        MenuArq = new javax.swing.JMenu();
        MenuItemArq1 = new javax.swing.JMenuItem();
        MenuCada = new javax.swing.JMenu();
        MenuItemCada1 = new javax.swing.JMenuItem();
        MenuItemCada2 = new javax.swing.JMenuItem();
        MenuRela = new javax.swing.JMenu();
        MenuItemRela = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setToolTipText("");

        MenuArq.setText("Arquivo");

        MenuItemArq1.setText("Sair");
        MenuItemArq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemArq1ActionPerformed(evt);
            }
        });
        MenuArq.add(MenuItemArq1);

        Menu.add(MenuArq);

        MenuCada.setText("Cadastro");
        MenuCada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadaActionPerformed(evt);
            }
        });

        MenuItemCada1.setText("Cadastro");
        MenuItemCada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCada1ActionPerformed(evt);
            }
        });
        MenuCada.add(MenuItemCada1);

        MenuItemCada2.setText("EAC");
        MenuItemCada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCada2ActionPerformed(evt);
            }
        });
        MenuCada.add(MenuItemCada2);

        Menu.add(MenuCada);

        MenuRela.setText("Relatórios");
        MenuRela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelaActionPerformed(evt);
            }
        });

        MenuItemRela.setText("Relatório de pessoas");
        MenuItemRela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemRelaActionPerformed(evt);
            }
        });
        MenuRela.add(MenuItemRela);

        Menu.add(MenuRela);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadaActionPerformed

    }//GEN-LAST:event_MenuCadaActionPerformed

    private void MenuItemCada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCada1ActionPerformed
        Cadastro cadPessoa = new Cadastro();
        cadPessoa.setVisible(true);
    }//GEN-LAST:event_MenuItemCada1ActionPerformed

    private void MenuItemCada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCada2ActionPerformed
        EAC consPessoa = new EAC();
        consPessoa.setVisible(true);
    }//GEN-LAST:event_MenuItemCada2ActionPerformed

    private void MenuRelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelaActionPerformed

    }//GEN-LAST:event_MenuRelaActionPerformed

    private void MenuItemRelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemRelaActionPerformed
        RelatorioPessoas relPessoa = new RelatorioPessoas();
        relPessoa.setVisible(true);
    }//GEN-LAST:event_MenuItemRelaActionPerformed

    private void MenuItemArq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemArq1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItemArq1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuArq;
    private javax.swing.JMenu MenuCada;
    private javax.swing.JMenuItem MenuItemArq1;
    private javax.swing.JMenuItem MenuItemCada1;
    private javax.swing.JMenuItem MenuItemCada2;
    private javax.swing.JMenuItem MenuItemRela;
    private javax.swing.JMenu MenuRela;
    // End of variables declaration//GEN-END:variables
}
