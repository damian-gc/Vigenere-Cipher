
import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.*;

public class Cifrador extends javax.swing.JFrame {
    int xx=0, yy=0;
    Cifrar cfr = new Cifrar();
    
    public Cifrador() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        shift.setBackground(new Color(0,0,0,0));
        ImageIcon img = new ImageIcon("src/pics/logo.png");
        this.setIconImage(img.getImage());
        campoChar.setBackground(new Color(0,0,0,0));
        //jScrollPane1.setBackground(new Color(0,0,0,0));
        cfr.fillMatrix();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        campoChar = new javax.swing.JTextField();
        caracteres = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        shift = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoTextoCifrado = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoTextoDescifrado = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoTextoLlano = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        limpiarBtn = new javax.swing.JLabel();
        descifrarBtn = new javax.swing.JLabel();
        cifrarBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cifrador Caesar");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 447, 260, 3));

        campoChar.setEditable(false);
        campoChar.setForeground(new java.awt.Color(255, 255, 255));
        campoChar.setBorder(null);
        campoChar.setOpaque(false);
        jPanel1.add(campoChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 420, 40, 15));

        caracteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Caracteres.png"))); // NOI18N
        jPanel1.add(caracteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 61, 15));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Icon awesome-window-minimize.png"))); // NOI18N
        minimizeBtn.setText("jLabel10");
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseExited(evt);
            }
        });
        jPanel1.add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 36, 9));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Icon awesome-window-close.png"))); // NOI18N
        closeBtn.setText("jLabel10");
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 0, 36, 31));

        shift.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        shift.setForeground(new java.awt.Color(255, 255, 255));
        shift.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        shift.setText("clave");
        shift.setBorder(null);
        shift.setOpaque(false);
        shift.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                shiftFocusGained(evt);
            }
        });
        jPanel1.add(shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 430, 250, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Texto cifrado.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 172, 38));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Ingrese clave.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 19));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Texto llano.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 146, 38));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Texto descifrado.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 218, 38));

        campoTextoCifrado.setEditable(false);
        campoTextoCifrado.setColumns(20);
        campoTextoCifrado.setLineWrap(true);
        campoTextoCifrado.setRows(5);
        campoTextoCifrado.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        campoTextoCifrado.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(campoTextoCifrado);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 178, 350, 245));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Rectangle 1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 346, 235));

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        campoTextoDescifrado.setEditable(false);
        campoTextoDescifrado.setColumns(20);
        campoTextoDescifrado.setLineWrap(true);
        campoTextoDescifrado.setRows(5);
        campoTextoDescifrado.setBorder(null);
        campoTextoDescifrado.setOpaque(false);
        campoTextoDescifrado.setSelectedTextColor(new java.awt.Color(0, 51, 255));
        campoTextoDescifrado.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(campoTextoDescifrado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 500, 170));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Rectangle 3.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 560, 488, 163));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        campoTextoLlano.setColumns(20);
        campoTextoLlano.setLineWrap(true);
        campoTextoLlano.setRows(5);
        campoTextoLlano.setOpaque(false);
        campoTextoLlano.setSelectionColor(new java.awt.Color(51, 102, 255));
        campoTextoLlano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTextoLlanoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoLlanoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(campoTextoLlano);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Rectangle 1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 346, 235));

        limpiarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/btn2.png"))); // NOI18N
        limpiarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limpiarBtnMouseExited(evt);
            }
        });
        jPanel1.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 119, 50));

        descifrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/btn3A.png"))); // NOI18N
        descifrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descifrarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                descifrarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                descifrarBtnMouseExited(evt);
            }
        });
        jPanel1.add(descifrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 119, 50));

        cifrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/btn1.png"))); // NOI18N
        cifrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cifrarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cifrarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cifrarBtnMouseExited(evt);
            }
        });
        jPanel1.add(cifrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 119, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/bg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_closeBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    //Función en la que se va a cifrar la cadena
    private void cifrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cifrarBtnMouseClicked
        // TODO add your handling code here:
        if(campoTextoLlano.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese texto llano primero");
        }else if(shift.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese una clave antes de continuar");
        }else{
            String textoCifrado = cfr.cifrar1(campoTextoLlano.getText(),shift.getText());
            System.out.println("Text: "+textoCifrado);
            String textoDescifrado = cfr.descifrar(textoCifrado,shift.getText());
            campoTextoCifrado.setText(textoCifrado);
            campoTextoDescifrado.setText(textoDescifrado);
        }
    }//GEN-LAST:event_cifrarBtnMouseClicked

    private void shiftFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_shiftFocusGained
        // TODO add your handling code here:
        shift.setText("");
    }//GEN-LAST:event_shiftFocusGained

    private void limpiarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBtnMouseClicked
        // TODO add your handling code here:
        campoTextoLlano.setText("");
        campoTextoCifrado.setText("");
        campoTextoDescifrado.setText("");
        shift.setText("");
        campoChar.setText("");
    }//GEN-LAST:event_limpiarBtnMouseClicked
    
    //Cambiando el color del botón de cifrar cuando haces un hover 
    private void cifrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cifrarBtnMouseEntered
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/btn1A.png");
        cifrarBtn.setIcon(icon);
    }//GEN-LAST:event_cifrarBtnMouseEntered
    //Cambiando el color del botón de cifrar cuando haces ya no haces un hover 
    private void cifrarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cifrarBtnMouseExited
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/btn1.png");
        cifrarBtn.setIcon(icon);
    }//GEN-LAST:event_cifrarBtnMouseExited

    private void limpiarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBtnMouseEntered
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/btn2A.png");
        limpiarBtn.setIcon(icon);
    }//GEN-LAST:event_limpiarBtnMouseEntered

    private void limpiarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBtnMouseExited
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/btn2.png");
        limpiarBtn.setIcon(icon);
    }//GEN-LAST:event_limpiarBtnMouseExited

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/closeBtn.png");
        closeBtn.setIcon(icon);
    }//GEN-LAST:event_closeBtnMouseEntered

    private void minimizeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseEntered
        // TODO add your handling code here
        Icon icon = new ImageIcon("src/pics/minimizebtn.png");
        minimizeBtn.setIcon(icon);
    }//GEN-LAST:event_minimizeBtnMouseEntered

    private void minimizeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseExited
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/Icon awesome-window-minimize.png");
        minimizeBtn.setIcon(icon);
    }//GEN-LAST:event_minimizeBtnMouseExited

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/Icon awesome-window-close.png");
        closeBtn.setIcon(icon);
    }//GEN-LAST:event_closeBtnMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_formMouseDragged

    private void campoTextoLlanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoLlanoKeyTyped
       
    }//GEN-LAST:event_campoTextoLlanoKeyTyped

    private void campoTextoLlanoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoLlanoKeyReleased
        // TODO add your handling code here:
        if(!campoTextoLlano.getText().equals("")){
            campoChar.setText(""+campoTextoLlano.getText().toString().length());
        }else{
            campoChar.setText("");
        }
    }//GEN-LAST:event_campoTextoLlanoKeyReleased

    private void descifrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descifrarBtnMouseClicked
        // TODO add your handling code here:
        if(campoTextoLlano.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese texto llano primero");
        }else if(shift.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese una clave antes de continuar");
        }
        else{
            String textoDescifrado = cfr.descifrar(campoTextoLlano.getText(),shift.getText());
            String textoCifrado = cfr.cifrar1(textoDescifrado,shift.getText());
            campoTextoCifrado.setText(textoCifrado);
            campoTextoDescifrado.setText(textoDescifrado);
        }
    }//GEN-LAST:event_descifrarBtnMouseClicked

    private void descifrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descifrarBtnMouseEntered
        // TODO add your handling code here:
        Icon icon = new ImageIcon("src/pics/btn3.png");
        descifrarBtn.setIcon(icon);
    }//GEN-LAST:event_descifrarBtnMouseEntered

    private void descifrarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descifrarBtnMouseExited
        // TODO add your handling code here:
         Icon icon = new ImageIcon("src/pics/btn3A.png");
        descifrarBtn.setIcon(icon);
    }//GEN-LAST:event_descifrarBtnMouseExited
    
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
            java.util.logging.Logger.getLogger(Cifrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cifrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cifrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cifrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cifrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoChar;
    private javax.swing.JTextArea campoTextoCifrado;
    private javax.swing.JTextArea campoTextoDescifrado;
    private javax.swing.JTextArea campoTextoLlano;
    private javax.swing.JLabel caracteres;
    private javax.swing.JLabel cifrarBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel descifrarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel limpiarBtn;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JTextField shift;
    // End of variables declaration//GEN-END:variables
}
