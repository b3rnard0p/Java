package pesquisagenética;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

    /**
 * Classe Interface que representa a interface gráfica do sistema de pesquisa genética.
 * Ela permite que o usuário busque por ocorrências de uma palavra em um texto utilizando
 * o algoritmo Boyer-Moore e carregue um arquivo de texto para a pesquisa.
 */
 
public class Interface extends javax.swing.JFrame {

        /**
     * Construtor da classe Interface. Inicializa os componentes da interface gráfica.
     */
    
    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtaTexto = new javax.swing.JTextArea();
        txtPesquisa = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jblTrecho = new javax.swing.JLabel();
        jblResultado = new javax.swing.JLabel();
        btnArquivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtaTexto.setColumns(20);
        txtaTexto.setRows(5);
        jScrollPane1.setViewportView(txtaTexto);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jblTrecho.setText("Trecho:");

        jblResultado.setText("Resultado:");

        btnArquivo.setText("Carregar Arquivo");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jblResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnArquivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jblTrecho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblTrecho))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblResultado)
                    .addComponent(btnPesquisar)
                    .addComponent(btnArquivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       /**
     * Evento acionado ao clicar no botão de "Pesquisar". Ele realiza a busca da expressão fornecida
     * no texto através do algoritmo Boyer-Moore e exibe o resultado de ocorrências encontradas.
     * 
     * @param evt - o evento gerado pelo clique do botão.
     */
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String texto = txtaTexto.getText();         
        String expressao = txtPesquisa.getText();   


        int ocorrencias = boyerMoore(expressao, expressao.length(), texto, texto.length());
        txtResultado.setText(String.valueOf(ocorrencias));
    }//GEN-LAST:event_btnPesquisarActionPerformed

        /**
     * Evento acionado ao clicar no botão de "Abrir Arquivo". Ele permite ao usuário selecionar
     * um arquivo de texto para ser carregado na área de texto da interface.
     * 
     * @param evt - o evento gerado pelo clique do botão.
     */
    
    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int retorno = fileChooser.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                StringBuilder conteudo = new StringBuilder();
                String linha;
                while ((linha = leitor.readLine()) != null) {
                    conteudo.append(linha).append("\n");
                }
                txtaTexto.setText(conteudo.toString());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao carregar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnArquivoActionPerformed

      /**
     * Implementação do algoritmo Boyer-Moore para busca de padrões em texto.
     * Este método encontra todas as ocorrências de uma palavra dentro de um texto.
     * 
     * @param palavra - o padrão a ser buscado.
     * @param tamanhoPalavra - o tamanho da palavra.
     * @param texto - o texto onde será feita a busca.
     * @param tamanhoTexto - o tamanho do texto.
     * @return o número de ocorrências da palavra encontrada no texto.
     */
    private int boyerMoore(String palavra, int tamanhoPalavra, String texto, int tamanhoTexto) {
        int[] salto = new int[tamanhoPalavra + 1]; 

        int h = tamanhoPalavra, k = tamanhoPalavra - 1;
        while (h >= 1 && k >= 1) {
            int i = tamanhoPalavra, j = k; 
            while (i >= h && j >= 1) {
                if (palavra.charAt(i - 1) == palavra.charAt(j - 1)) {
                    --i;
                    --j;
                } else {
                    i = tamanhoPalavra;
                    j = --k;
                }
            }
            salto[h--] = k;
        }
        while (h >= 1) {
            salto[h--] = k;
        }

        int ocorrencias = 0; 
        k = tamanhoPalavra;
        while (k <= tamanhoTexto) {
            int i = tamanhoPalavra, j = k;
            while (i >= 1 && palavra.charAt(i - 1) == texto.charAt(j - 1)) {
                --i;
                --j;   
            }
            if (i < 1) {
                ++ocorrencias;
            }
            if (i == tamanhoPalavra) {
                k += 1; 
            } else {
                k += tamanhoPalavra - salto[i + 1]; 
            }
        }
        return ocorrencias; 
    }
          
    /**
     * Método principal que inicializa a interface gráfica.
     * 
     * @param args - argumentos da linha de comando (não utilizados).
     */
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblResultado;
    private javax.swing.JLabel jblTrecho;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextArea txtaTexto;
    // End of variables declaration//GEN-END:variables
}
