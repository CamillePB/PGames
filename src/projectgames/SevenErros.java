package projectgames;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class SevenErros extends javax.swing.JFrame {

    int contA = 0, contE = 0, contT = 0;

    /**
     * Creates new form SevenErros
     */
    public SevenErros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jerros = new javax.swing.JLabel();
        jacertos = new javax.swing.JLabel();
        jbvoltar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbmensagem = new javax.swing.JLabel();
        lbtotal = new javax.swing.JLabel();
        jmylabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 20, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 20, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 20, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 20, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 20, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Acertos:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 60, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Erros:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, -1, -1));

        jerros.setBackground(new java.awt.Color(255, 255, 255));
        jerros.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jerros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jerros.setOpaque(true);
        getContentPane().add(jerros, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 60, 30));

        jacertos.setBackground(new java.awt.Color(255, 255, 255));
        jacertos.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jacertos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jacertos.setOpaque(true);
        getContentPane().add(jacertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 60, 30));

        jbvoltar2.setBackground(new java.awt.Color(235, 234, 234));
        jbvoltar2.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jbvoltar2.setText("Voltar");
        jbvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvoltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbvoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 0));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 20, 20));
        getContentPane().add(lbmensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 320, 60));
        getContentPane().add(lbtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 50, 40));

        jmylabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jmylabel.setForeground(new java.awt.Color(204, 51, 0));
        jmylabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo_7_erros_3.png"))); // NOI18N
        jmylabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmylabelMouseClicked(evt);
            }
        });
        getContentPane().add(jmylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 530, 520));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("7 Erros");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 150, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmylabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmylabelMouseClicked

        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        JOptionPane.showMessageDialog(null, "Errou");
        contE++;

        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }

        lbtotal.setText(String.valueOf(contT));

        jerros.setText(String.valueOf(contE));

        lbmensagem.setText("Errou!!");

        
        
        
    }//GEN-LAST:event_jmylabelMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        if (jLabel2.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Burro!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acertou");
        jLabel2.setText("X");

        contA++;
        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }
        
if(contA==6){jacertos.setText(String.valueOf(contA+1));}
        
        jacertos.setText(String.valueOf(contA));

        lbtotal.setText(String.valueOf(contT));


    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        if (jLabel3.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Burro!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acertou");
        jLabel3.setText("X");
        contA++;
        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }

        if(contA==6){jacertos.setText(String.valueOf(contA+1));}
        
        jacertos.setText(String.valueOf(contA));

        lbtotal.setText(String.valueOf(contT));


    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        if (jLabel4.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Burro!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acertou");
        jLabel4.setText("X");
        contA++;
        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }

        if(contA==6){jacertos.setText(String.valueOf(contA+1));}
        
        jacertos.setText(String.valueOf(contA));

        lbtotal.setText(String.valueOf(contT));


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        if (jLabel5.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Burro!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acertou");
        jLabel5.setText("X");
        contA++;
        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }
        
        if(contA==6){jacertos.setText(String.valueOf(contA+1));}

        jacertos.setText(String.valueOf(contA));

        lbtotal.setText(String.valueOf(contT));


    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        if (jLabel6.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Burro!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acertou");
        jLabel6.setText("X");
        contA++;
        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }
        
        if(contA==6){jacertos.setText(String.valueOf(contA+1));}

        jacertos.setText(String.valueOf(contA));

        lbtotal.setText(String.valueOf(contT));


    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        if (jLabel1.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Burro!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acertou");
        jLabel1.setText("X");
        contA++;
        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }
        
        if(contA==6){jacertos.setText(String.valueOf(contA+1));}

        jacertos.setText(String.valueOf(contA));

        lbtotal.setText(String.valueOf(contT));


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jbvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvoltar2ActionPerformed
        MenuGames exec = new MenuGames();
        exec.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbvoltar2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        if (contT == 15) {
            JOptionPane.showMessageDialog(null, "Fim de Jogo");
            return;
        }

        if (jLabel7.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Burro!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acertou");
        jLabel7.setText("X");
        contA++;
        contT++;

        if (contA == 7) {
            JOptionPane.showMessageDialog(null, "Parabens!");
            return;
        }
        
        if(contA==6){jacertos.setText(String.valueOf(contA+1));}

        jacertos.setText(String.valueOf(contA));

        lbtotal.setText(String.valueOf(contT));

    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SevenErros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SevenErros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SevenErros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SevenErros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SevenErros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jacertos;
    private javax.swing.JButton jbvoltar2;
    private javax.swing.JLabel jerros;
    private javax.swing.JLabel jmylabel;
    private javax.swing.JLabel lbmensagem;
    private javax.swing.JLabel lbtotal;
    // End of variables declaration//GEN-END:variables
}
