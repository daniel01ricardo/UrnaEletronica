/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Candidato;
import classes.CandidatoDAO;
import classes.Eleitor;
import classes.EleitorDAO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Gabriel Freitas
 */
public class UrnaEletronica extends javax.swing.JFrame {

    /**
     * Creates new form UrnaEletronica
     */
    public UrnaEletronica() {
        initComponents();
    }
    
    
    public void play(String nomeDoAudio){
        URL url = getClass().getResource("/sons/"+nomeDoAudio+".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
        
    }
    
    public String var;

    private void carregarFormulario(Candidato can) {  // Setar os demais "campos" da tela
        jTFvice_can.setText(can.getVice());
        jTFnome_can.setText(can.getNome());
        jTFpartido_can.setText(can.getPartido());
        ImageIcon icone;
        ImageIcon icone2;
        icone = new ImageIcon(getClass().getResource("/images/" + can.getFoto()));
        icone.setImage(icone.getImage().getScaledInstance(150, 150, 100));
        icone2 = new ImageIcon(getClass().getResource("/images/" + can.getFotovice()));
        icone2.setImage(icone2.getImage().getScaledInstance(150, 150, 100));
        jLfoto.setIcon(icone);
        jLfotoVice.setIcon(icone2);

    }

    private void alterarTela2() {
        identificacaoEleitor nomequalquer = new identificacaoEleitor();
        nomequalquer.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTF_numSecond = new javax.swing.JTextField();
        jTF_numFirst = new javax.swing.JTextField();
        jTFnome_can = new javax.swing.JTextField();
        jTFpartido_can = new javax.swing.JTextField();
        jTFvice_can = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLfoto = new javax.swing.JLabel();
        jLfotoVice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBbranco = new javax.swing.JButton();
        jBcorrige = new javax.swing.JButton();
        jBconfirma = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jTF_numSecond.setBackground(new java.awt.Color(255, 255, 255));
        jTF_numSecond.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jTF_numSecond.setForeground(new java.awt.Color(0, 0, 0));

        jTF_numFirst.setBackground(new java.awt.Color(255, 255, 255));
        jTF_numFirst.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jTF_numFirst.setForeground(new java.awt.Color(0, 0, 0));

        jTFnome_can.setBackground(new java.awt.Color(255, 255, 255));

        jTFpartido_can.setBackground(new java.awt.Color(255, 255, 255));
        jTFpartido_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFpartido_canActionPerformed(evt);
            }
        });

        jTFvice_can.setBackground(new java.awt.Color(255, 255, 255));
        jTFvice_can.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Partido:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Vice:");

        jLfoto.setBackground(new java.awt.Color(204, 204, 204));
        jLfoto.setForeground(new java.awt.Color(0, 0, 0));

        jLfotoVice.setBackground(new java.awt.Color(204, 204, 204));
        jLfotoVice.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFpartido_can, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jTF_numFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jTF_numSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTFnome_can, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(jTFvice_can))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLfotoVice, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTF_numFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_numSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFnome_can, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(jTFpartido_can, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFvice_can, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLfotoVice, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jBbranco.setBackground(new java.awt.Color(255, 255, 255));
        jBbranco.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBbranco.setForeground(new java.awt.Color(0, 0, 0));
        jBbranco.setText("Branco");
        jBbranco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBbrancoMouseClicked(evt);
            }
        });
        jBbranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbrancoActionPerformed(evt);
            }
        });

        jBcorrige.setBackground(new java.awt.Color(204, 102, 0));
        jBcorrige.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBcorrige.setForeground(new java.awt.Color(0, 0, 0));
        jBcorrige.setText("Corrige");
        jBcorrige.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcorrigeMouseClicked(evt);
            }
        });

        jBconfirma.setBackground(new java.awt.Color(0, 102, 0));
        jBconfirma.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBconfirma.setForeground(new java.awt.Color(0, 0, 0));
        jBconfirma.setText("Confirma");
        jBconfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBconfirmaMouseClicked(evt);
            }
        });
        jBconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmaActionPerformed(evt);
            }
        });

        jB0.setBackground(new java.awt.Color(0, 0, 0));
        jB0.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB0.setForeground(new java.awt.Color(255, 255, 255));
        jB0.setText("0");
        jB0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jB8.setBackground(new java.awt.Color(0, 0, 0));
        jB8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB8.setForeground(new java.awt.Color(255, 255, 255));
        jB8.setText("8");
        jB8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setBackground(new java.awt.Color(0, 0, 0));
        jB9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB9.setForeground(new java.awt.Color(255, 255, 255));
        jB9.setText("9");
        jB9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB6.setBackground(new java.awt.Color(0, 0, 0));
        jB6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB6.setForeground(new java.awt.Color(255, 255, 255));
        jB6.setText("6");
        jB6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB5.setBackground(new java.awt.Color(0, 0, 0));
        jB5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB5.setForeground(new java.awt.Color(255, 255, 255));
        jB5.setText("5");
        jB5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB4.setBackground(new java.awt.Color(0, 0, 0));
        jB4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB4.setForeground(new java.awt.Color(255, 255, 255));
        jB4.setText("4");
        jB4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB7.setBackground(new java.awt.Color(0, 0, 0));
        jB7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB7.setForeground(new java.awt.Color(255, 255, 255));
        jB7.setText("7");
        jB7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB1.setBackground(new java.awt.Color(0, 0, 0));
        jB1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB1.setForeground(new java.awt.Color(255, 255, 255));
        jB1.setText("1");
        jB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB1MouseClicked(evt);
            }
        });
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setBackground(new java.awt.Color(0, 0, 0));
        jB2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB2.setForeground(new java.awt.Color(255, 255, 255));
        jB2.setText("2");
        jB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setBackground(new java.awt.Color(0, 0, 0));
        jB3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jB3.setForeground(new java.awt.Color(255, 255, 255));
        jB3.setText("3");
        jB3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBbranco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jBcorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jBconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBcorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBbranco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-je.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numCandidato(String numero) {
        CandidatoDAO a = new CandidatoDAO();
        Candidato can = new Candidato();
        if (jTF_numFirst.getText().equals("") && jTF_numSecond.getText().equals("")) {
            jTF_numFirst.setText(numero);

        } else if (!jTF_numFirst.getText().equals("")) {
            jTF_numSecond.setText(numero);

            can = a.consultarCandidatoPorNumero(jTF_numFirst.getText().concat(jTF_numSecond.getText()));
            carregarFormulario(can);

        }
    }

    private void jB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB1MouseClicked
        play("click");
        numCandidato("1");
        
    }//GEN-LAST:event_jB1MouseClicked

    private void jBbrancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbrancoMouseClicked
        // TODO add your handling code here:
        play("confirmar");
        CandidatoDAO dao = new CandidatoDAO();
        EleitorDAO ele = new EleitorDAO();
        dao.attVotoBranco();
        ele.attVotoEleitor(var);
        

    }//GEN-LAST:event_jBbrancoMouseClicked

    private void jBcorrigeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcorrigeMouseClicked
        // TODO add your handling code here:
        jTF_numFirst.setText("");
        jTF_numSecond.setText("");
        jTFnome_can.setText("");
        jTFpartido_can.setText("");
        jTFvice_can.setText("");
        jLfoto.setIcon(null);
        jLfotoVice.setIcon(null);
        play("sumiu");

    }//GEN-LAST:event_jBcorrigeMouseClicked

    private void jBconfirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBconfirmaMouseClicked
        // TODO add your handling code here:
        play("confirmar");
        CandidatoDAO dao = new CandidatoDAO();
        EleitorDAO ele = new EleitorDAO();
        Eleitor a = new Eleitor();

        dao.attCandidatoPorNumero(jTF_numFirst.getText().concat(jTF_numSecond.getText()));
        ele.attVotoEleitor(identificacaoEleitor.var);
        JOptionPane.showMessageDialog(this, "VOTO COMPUTADO");
        
        
        Timer t1 = new Timer(0, null);
        t1.start();
        try {
            Thread.sleep(2500);
            dispose();
            
        } catch (InterruptedException e) {

        }
        t1.stop();


    }//GEN-LAST:event_jBconfirmaMouseClicked

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        play("click");
        numCandidato("2");
        
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        play("click");
        numCandidato("3");
        
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        play("click");
        numCandidato("4");
        
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        play("click");
        numCandidato("5");
        
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        play("botao");
        numCandidato("6");
        
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        play("click");
        numCandidato("7");
        
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        play("click");
        numCandidato("8");
        
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        play("click");
        numCandidato("9");
        
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        play("click");
        numCandidato("0");
        
    }//GEN-LAST:event_jB0ActionPerformed

    private void jBconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBconfirmaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

        Eleitor ele = new Eleitor();
        EleitorDAO dao = new EleitorDAO();
        ele = dao.consultarEleitorPorTitulo(identificacaoEleitor.var);


    }//GEN-LAST:event_formWindowActivated

    private void jTFpartido_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFpartido_canActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFpartido_canActionPerformed

    private void jBbrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbrancoActionPerformed
        // TODO add your handling code here:
        CandidatoDAO dao = new CandidatoDAO();
        EleitorDAO ele = new EleitorDAO();
        dao.attVotoBranco();
        ele.attVotoEleitor(identificacaoEleitor.var);
        JOptionPane.showMessageDialog(this, "VOTO COMPUTADO");
        Timer t1 = new Timer(0, null);
        t1.start();
        try {
            Thread.sleep(2500);
            dispose();
            //alteraTela2();

        } catch (InterruptedException e) {

        }
        t1.stop();
    }//GEN-LAST:event_jBbrancoActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrnaEletronica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBbranco;
    private javax.swing.JButton jBconfirma;
    private javax.swing.JButton jBcorrige;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLfoto;
    private javax.swing.JLabel jLfotoVice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTF_numFirst;
    private javax.swing.JTextField jTF_numSecond;
    private javax.swing.JTextField jTFnome_can;
    private javax.swing.JTextField jTFpartido_can;
    private javax.swing.JTextField jTFvice_can;
    // End of variables declaration//GEN-END:variables

}
