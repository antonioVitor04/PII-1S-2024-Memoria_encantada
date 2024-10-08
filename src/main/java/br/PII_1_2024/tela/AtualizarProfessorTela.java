/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.tela;

import br.PII_1_2024.bd.ProfessorDAO;
import br.PII_1_2024.jogo.TelaFundoJogo;
import br.PII_1_2024.modelo.Professor;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;


/**
 *
 * @author anton
 */
public class AtualizarProfessorTela extends javax.swing.JFrame {
    private int codigo = LoginTelaProfessor.codigoProfessor;
    /**
     * Creates new form AtualizarSenhaTela
     */
    public AtualizarProfessorTela() {
        initComponents();
        buscarProfessor();
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/TelaInicio.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(fundo);
        this.pack();
    }
    
    private void buscarProfessor(){
        Professor professor = new Professor(codigo);
        ProfessorDAO dao = new ProfessorDAO();
        try{
           Professor p = dao.obterProfessorLogado(professor);
           codigoProfessorTextField.setText(Integer.toString(p.getCodigo()));
           nomeProfessorTextField.setText(p.getNome());
           senhaProfessorTextField.setText(p.getSenha()); 
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "professor indisponível, tente"
                + "novamente mais tarde.");
        e.printStackTrace();
        }
    
    }
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        codigoProfessorTextField = new javax.swing.JTextField();
        nomeProfessorTextField = new javax.swing.JTextField();
        senhaProfessorTextField = new javax.swing.JTextField();
        atualizarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setOpaque(false);

        jPanel1.setOpaque(false);

        codigoProfessorTextField.setEditable(false);

        nomeProfessorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProfessorTextFieldActionPerformed(evt);
            }
        });

        senhaProfessorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaProfessorTextFieldActionPerformed(evt);
            }
        });

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senhaProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(atualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(codigoProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaProfessorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaProfessorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaProfessorTextFieldActionPerformed

    private void nomeProfessorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProfessorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProfessorTextFieldActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        
        String nomeProfessor = nomeProfessorTextField.getText();
        String senhaProfessor = senhaProfessorTextField.getText();
        if (nomeProfessor == null || nomeProfessor.length() == 0 && senhaProfessor.length() == 0 
                || senhaProfessor.length() < 8){
            
            JOptionPane.showMessageDialog(null, "ERRO. DIGITE AS CREDENCIAIS CORRETAS");
        }
        else{    
            int escolha = JOptionPane.showConfirmDialog(null, "Atualizar professor?");
            if (escolha == JOptionPane.YES_OPTION){
                try{
                    int codigo = Integer.parseInt(codigoProfessorTextField.getText());
                    String nome = nomeProfessorTextField.getText();
                    String senha = senhaProfessorTextField.getText();
                    Professor professor = new Professor (codigo, nome, senha);
                    ProfessorDAO dao = new ProfessorDAO();
                    dao.atualizarProfessor(professor);
                    JOptionPane.showMessageDialog(null, "professor atualizado"
                            + " com sucesso");
                    buscarProfessor();                   
                    
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente "
                            + "mais tarde.");
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HUBProfessor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField codigoProfessorTextField;
    private javax.swing.JPanel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeProfessorTextField;
    private javax.swing.JTextField senhaProfessorTextField;
    // End of variables declaration//GEN-END:variables
}
