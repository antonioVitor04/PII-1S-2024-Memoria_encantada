/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.tela;

import br.PII_1_2024.bd.AlunoFaseDAO;
import br.PII_1_2024.jogo.AudioCurto;
import br.PII_1_2024.jogo.JogoDaMemoria;
import br.PII_1_2024.jogo.TelaFundoJogo;
import br.PII_1_2024.modelo.AlunoFase;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author anton
 */
public class FaseParquinho extends javax.swing.JFrame {
    private AudioCurto clipPlayer;
    private static int alunoAtual = LoginTelaAluno.codigoAluno;
    private static AlunoFaseDAO dao = new AlunoFaseDAO();
    /**
     * Creates new form FaseParquinho
     */
    public FaseParquinho() {
        initComponents();
        clipPlayer = new AudioCurto("src/main/resources/audio/botaoSound.mp3");
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/ImagemFundoParquinho.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(parquinho);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parquinho = new javax.swing.JPanel();
        iniciarParquinho = new javax.swing.JLabel();
        voltarButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parquinho.setOpaque(false);

        iniciarParquinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoParquinho.png"))); // NOI18N
        iniciarParquinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarParquinhoMouseClicked(evt);
            }
        });

        voltarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoVoltar.png"))); // NOI18N
        voltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout parquinhoLayout = new javax.swing.GroupLayout(parquinho);
        parquinho.setLayout(parquinhoLayout);
        parquinhoLayout.setHorizontalGroup(
            parquinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parquinhoLayout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addComponent(iniciarParquinho, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(459, 459, 459))
            .addGroup(parquinhoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parquinhoLayout.setVerticalGroup(
            parquinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parquinhoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(iniciarParquinho, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parquinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parquinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarParquinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarParquinhoMouseClicked
        clipPlayer.playSound(); 
        dispose();
        var jogoParquinho = new JogoDaMemoria("parquinho", "imagemParquinho.png");
        jogoParquinho.inicializarJogoMemoria(10, "parquinho");
        jogoParquinho.setVisible(true);
        jogoParquinho.setJogoTerminadoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long t = jogoParquinho.getTempoTotal();
                int tempoFase = Math.toIntExact(t);
                try{
                    AlunoFase alunoFase = new AlunoFase(1, alunoAtual, tempoFase);
                    dao.inserirAlunoFase(alunoFase);
                }
                catch(Exception ev){
                    ev.printStackTrace();
                }
                var p = new TelaParabens(tempoFase);
                p.setVisible(true);
                jogoParquinho.dispose(); 
                
            }
        });
    }//GEN-LAST:event_iniciarParquinhoMouseClicked

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        clipPlayer.playSound(); 
        new TelaMapa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iniciarParquinho;
    private javax.swing.JPanel parquinho;
    private javax.swing.JLabel voltarButton;
    // End of variables declaration//GEN-END:variables
}
