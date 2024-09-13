package Revisão;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Interface extends javax.swing.JFrame {
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Aluno> listaAlunos;
    private DefaultTableModel professorTableModel, alunoTableModel;
    
    public Interface() {
        initComponents();
        listaProfessores = new ArrayList<>();
        listaAlunos = new ArrayList<>();  
        professorTableModel = (DefaultTableModel) JPro.getModel();
        alunoTableModel = (DefaultTableModel) JAlu.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGRP_Sexo = new javax.swing.ButtonGroup();
        btnGrp_Escolha = new javax.swing.ButtonGroup();
        jblTitulo = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jblData = new javax.swing.JLabel();
        jblSexo = new javax.swing.JLabel();
        jblCPF = new javax.swing.JLabel();
        jblRG = new javax.swing.JLabel();
        jblEndereco = new javax.swing.JLabel();
        jblEstado = new javax.swing.JLabel();
        jblTelefone = new javax.swing.JLabel();
        jblPai = new javax.swing.JLabel();
        jblMae = new javax.swing.JLabel();
        jblNacionalidade = new javax.swing.JLabel();
        jblMatricula = new javax.swing.JLabel();
        jblFormacao = new javax.swing.JLabel();
        jblCursoalo = new javax.swing.JLabel();
        jblGraduacao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        rdoMasc = new javax.swing.JRadioButton();
        rdoFemi = new javax.swing.JRadioButton();
        txtCPF = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        txtTelefone = new javax.swing.JTextField();
        txtPai = new javax.swing.JTextField();
        txtMae = new javax.swing.JTextField();
        txtNacionalidade = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtFormacao = new javax.swing.JTextField();
        txtCursoalo = new javax.swing.JTextField();
        txtGraduacao = new javax.swing.JTextField();
        jblEscolha = new javax.swing.JLabel();
        rdoPro = new javax.swing.JRadioButton();
        rdoAlu = new javax.swing.JRadioButton();
        btnCadastar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JAlu = new javax.swing.JTable();
        jblProfessor = new javax.swing.JLabel();
        jblAluno = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JPro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jblTitulo.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jblTitulo.setForeground(new java.awt.Color(0, 153, 0));
        jblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblTitulo.setText("Formulário");

        jblNome.setText("Nome Completo:");

        jblData.setText("Data de Nascmiento:");

        jblSexo.setText("Sexo:");

        jblCPF.setText("CPF:");

        jblRG.setText("RG:");

        jblEndereco.setText("Endereço Completo:");

        jblEstado.setText("Estado:");

        jblTelefone.setText("Telefone de Contato:");

        jblPai.setText("Nome do Pai:");

        jblMae.setText("Nome da Mãe:");

        jblNacionalidade.setText("Nacionalidade:");

        jblMatricula.setText("Matrícula:");

        jblFormacao.setText("Área de Formação:");

        jblCursoalo.setText("Curso Alocado:");

        jblGraduacao.setText("Curso de Graduação:");

        btnGRP_Sexo.add(rdoMasc);
        rdoMasc.setText("Masculino");

        btnGRP_Sexo.add(rdoFemi);
        rdoFemi.setText("Feminino");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL ", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jblEscolha.setText("Tabela:");

        btnGrp_Escolha.add(rdoPro);
        rdoPro.setText("Professor");
        rdoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoProActionPerformed(evt);
            }
        });

        btnGrp_Escolha.add(rdoAlu);
        rdoAlu.setText("Aluno");
        rdoAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAluActionPerformed(evt);
            }
        });

        btnCadastar.setText("Cadastrar");
        btnCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarActionPerformed(evt);
            }
        });

        JAlu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "D. de Nasc.", "Sexo", "CPF", "RG", "Endereço", "Estado", "Telefone", "Pai", "Mãe", "Nacionalidade", "Matrícula", "Cuurso"
            }
        ));
        jScrollPane1.setViewportView(JAlu);

        jblProfessor.setText("Professor");

        jblAluno.setText("Aluno");

        JPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "D. de Nasc.", "Sexo", "CPF", "RG", "Endereço", "Estado", "Telefone", "Pai", "Mãe", "Nacionalidade", "Matrícula", "Formação", "Curso"
            }
        ));
        jScrollPane3.setViewportView(JPro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblMae)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMae))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatricula))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblCursoalo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCursoalo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblGraduacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGraduacao))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblEscolha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoPro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoAlu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblRG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblPai)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblNacionalidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblFormacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jblSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoMasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoFemi)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jblAluno)
                                .addGap(298, 298, 298))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jblProfessor)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEscolha)
                            .addComponent(rdoPro)
                            .addComponent(rdoAlu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblData)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblSexo)
                            .addComponent(rdoMasc)
                            .addComponent(rdoFemi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblRG)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEstado)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblPai)
                            .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblMae)
                            .addComponent(txtMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNacionalidade)
                            .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblMatricula)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblFormacao)
                            .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCursoalo)
                            .addComponent(txtCursoalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblGraduacao)
                            .addComponent(txtGraduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(btnCadastar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jblAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jblCPF, jblCursoalo, jblData, jblEndereco, jblEstado, jblFormacao, jblGraduacao, jblMae, jblMatricula, jblNacionalidade, jblNome, jblPai, jblRG, jblSexo, jblTelefone});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoProActionPerformed
        txtFormacao.setEnabled(true);
        txtCursoalo.setEnabled(true);
        txtGraduacao.setEnabled(false);    
    }//GEN-LAST:event_rdoProActionPerformed

    private void rdoAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAluActionPerformed
        txtFormacao.setEnabled(false);
        txtCursoalo.setEnabled(false);
        txtGraduacao.setEnabled(true); 
    }//GEN-LAST:event_rdoAluActionPerformed

    private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarActionPerformed
        
        if (rdoPro.isSelected()) {
            Professor professor = new Professor();
            professor.setNomeCompleto(txtNome.getText());
            professor.setDataNascimento(txtData.getText());
            professor.setSexo(rdoMasc.isSelected() ? "Masculino" : "Feminino");
            professor.setCpf(txtCPF.getText());
            professor.setRg(txtRG.getText());
            professor.setEnderecoCompleto(txtEndereco.getText());
            professor.setEstado((String) cmbEstado.getSelectedItem());
            professor.setTelefoneContato(txtTelefone.getText());
            professor.setNomePai(txtPai.getText());
            professor.setNomeMae(txtMae.getText());
            professor.setNacionalidade(txtNacionalidade.getText());
            professor.setMatricula(txtMatricula.getText());
            professor.setAreaFormacao(txtFormacao.getText());
            professor.setAlocacaoCurso(txtCursoalo.getText());

            listaProfessores.add(professor);
            professorTableModel.addRow(new Object[]{professor.getNomeCompleto(), professor.getDataNascimento(), professor.getSexo(), 
            professor.getCpf(), professor.getRg(), professor.getEnderecoCompleto(), professor.getEstado(), professor.getTelefoneContato(), professor.getNomePai(), 
            professor.getNomeMae(), professor.getNacionalidade(),  professor.getMatricula(), professor.getAreaFormacao(), professor.getAlocacaoCurso()});
            professor.executaAcao();
        } else if (rdoAlu.isSelected()) {
            Aluno aluno = new Aluno();
            aluno.setNomeCompleto(txtNome.getText());
            aluno.setDataNascimento(txtData.getText());
            aluno.setSexo(rdoMasc.isSelected() ? "Masculino" : "Feminino");
            aluno.setCpf(txtCPF.getText());
            aluno.setRg(txtRG.getText());
            aluno.setEnderecoCompleto(txtEndereco.getText());
            aluno.setEstado((String) cmbEstado.getSelectedItem());
            aluno.setTelefoneContato(txtTelefone.getText());
            aluno.setNomePai(txtPai.getText());
            aluno.setNomeMae(txtMae.getText());
            aluno.setNacionalidade(txtNacionalidade.getText());
            aluno.setMatricula(txtMatricula.getText());
            aluno.setCursoGraduacao(txtGraduacao.getText());

            listaAlunos.add(aluno);
            alunoTableModel.addRow(new Object[]{aluno.getNomeCompleto(), aluno.getDataNascimento(), aluno.getSexo(), aluno.getCpf(), aluno.getRg(),
            aluno.getEnderecoCompleto(), aluno.getEstado(), aluno.getTelefoneContato(), aluno.getNomePai(), aluno.getNomeMae(), aluno.getNacionalidade(),
            aluno.getMatricula(), aluno.getCursoGraduacao()});
            aluno.executaAcao();
        }
        limparCampos();
    }//GEN-LAST:event_btnCadastarActionPerformed

    private void limparCampos() {
    txtNome.setText("");
    txtData.setText("");
    txtCPF.setText("");
    txtRG.setText("");
    txtEndereco.setText("");
    txtTelefone.setText("");
    txtPai.setText("");
    txtMae.setText("");
    txtNacionalidade.setText("");
    txtMatricula.setText("");
    txtFormacao.setText("");
    txtCursoalo.setText("");
    txtGraduacao.setText("");
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JAlu;
    private javax.swing.JTable JPro;
    private javax.swing.JButton btnCadastar;
    private javax.swing.ButtonGroup btnGRP_Sexo;
    private javax.swing.ButtonGroup btnGrp_Escolha;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jblAluno;
    private javax.swing.JLabel jblCPF;
    private javax.swing.JLabel jblCursoalo;
    private javax.swing.JLabel jblData;
    private javax.swing.JLabel jblEndereco;
    private javax.swing.JLabel jblEscolha;
    private javax.swing.JLabel jblEstado;
    private javax.swing.JLabel jblFormacao;
    private javax.swing.JLabel jblGraduacao;
    private javax.swing.JLabel jblMae;
    private javax.swing.JLabel jblMatricula;
    private javax.swing.JLabel jblNacionalidade;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jblPai;
    private javax.swing.JLabel jblProfessor;
    private javax.swing.JLabel jblRG;
    private javax.swing.JLabel jblSexo;
    private javax.swing.JLabel jblTelefone;
    private javax.swing.JLabel jblTitulo;
    private javax.swing.JRadioButton rdoAlu;
    private javax.swing.JRadioButton rdoFemi;
    private javax.swing.JRadioButton rdoMasc;
    private javax.swing.JRadioButton rdoPro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCursoalo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtGraduacao;
    private javax.swing.JTextField txtMae;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
