/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.EleitorDAO;
import classes.Eleitor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Freitas
 */


public class identificacaoEleitor extends javax.swing.JFrame {

    /**
     * Creates new form identificacaoEleitor
     */
    public static String var;
    
    public identificacaoEleitor() {
        initComponents();
    }
    
    

    private void botoes(boolean seguir) {
        jBseguir.setEnabled(seguir);
    }

    private void carregarFormulario(Eleitor ele) {

        jTFnome.setText(ele.getNome());
        jTFdataNasc.setText(ele.getDataNasc());
        jTFzona.setText(ele.getZona());
        jTFvotou.setText(ele.getVotou());
        jTFsecao.setText(ele.getSecao());
        jTFcidade.setText(ele.getCidade());
        jTFestado.setText(ele.getEstado());
        ImageIcon icone3;
        icone3 = new ImageIcon(getClass().getResource("/images/"+ ele.getFoto())); 
        icone3.setImage(icone3.getImage().getScaledInstance(200, 200, 100));
        jLfoto.setIcon(icone3);
    }

    private void alterarTela() {
        UrnaEletronica nomequalquer = new UrnaEletronica();
        nomequalquer.setVisible(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTFid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();
        jBseguir = new javax.swing.JButton();
        jTFvotou = new javax.swing.JTextField();
        jTFnome = new javax.swing.JTextField();
        jTFdataNasc = new javax.swing.JTextField();
        jTFzona = new javax.swing.JTextField();
        jTFsecao = new javax.swing.JTextField();
        jTFcidade = new javax.swing.JTextField();
        jLfoto = new javax.swing.JLabel();
        jTFestado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jTFid.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Identificação:");

        jBbuscar.setBackground(new java.awt.Color(0, 204, 204));
        jBbuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBbuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBbuscar.setText("Buscar");
        jBbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBbuscarMouseClicked(evt);
            }
        });
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBseguir.setBackground(new java.awt.Color(0, 102, 0));
        jBseguir.setForeground(new java.awt.Color(255, 255, 255));
        jBseguir.setText("Seguir    -->");
        jBseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBseguirMouseClicked(evt);
            }
        });
        jBseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBseguirActionPerformed(evt);
            }
        });

        jTFvotou.setBackground(new java.awt.Color(255, 255, 255));

        jTFnome.setBackground(new java.awt.Color(255, 255, 255));

        jTFdataNasc.setBackground(new java.awt.Color(255, 255, 255));

        jTFzona.setBackground(new java.awt.Color(255, 255, 255));

        jTFsecao.setBackground(new java.awt.Color(255, 255, 255));

        jTFcidade.setBackground(new java.awt.Color(255, 255, 255));

        jLfoto.setForeground(new java.awt.Color(0, 0, 0));

        jTFestado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Votou:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data Nascimento:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Zona:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Seção:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cidade:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Estado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFdataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTFzona, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jTFestado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFvotou, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addComponent(jTFsecao))
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFvotou, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFdataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFzona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFsecao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFestado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jBseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbuscarMouseClicked

        EleitorDAO dao;
        dao = new EleitorDAO();
        Eleitor ele = new Eleitor();

        if (!jTFid.getText().equals("")) {
            ele = dao.consultarEleitorPorTitulo(jTFid.getText());
            carregarFormulario(ele);
            
            botoes(true);
        } else {
            JOptionPane.showMessageDialog(null, "Eleitor não cadastrado");
            botoes(false);
        }
        

    }//GEN-LAST:event_jBbuscarMouseClicked

    private void jBseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBseguirMouseClicked
        EleitorDAO dao = new EleitorDAO();
        Eleitor ele = new Eleitor();
        // TODO add your handling code here:
        if (jTFid.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Verifique os Campos");
        } else if (jTFvotou.getText().equals("S")) {
            JOptionPane.showMessageDialog(null, "Eleitor já votou!!");
            botoes(false);
        } else {
            ele = dao.consultarEleitorPorTitulo(jTFid.getText());
            var = ele.getTitulo();
            //JOptionPane.showMessageDialog(null, var);
            alterarTela();
        }
        
    }//GEN-LAST:event_jBseguirMouseClicked

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBseguirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBseguirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowActivated

    
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
            java.util.logging.Logger.getLogger(identificacaoEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(identificacaoEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(identificacaoEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(identificacaoEleitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new identificacaoEleitor().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBseguir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLfoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFcidade;
    private javax.swing.JTextField jTFdataNasc;
    private javax.swing.JTextField jTFestado;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTextField jTFnome;
    private javax.swing.JTextField jTFsecao;
    private javax.swing.JTextField jTFvotou;
    private javax.swing.JTextField jTFzona;
    // End of variables declaration//GEN-END:variables
}
