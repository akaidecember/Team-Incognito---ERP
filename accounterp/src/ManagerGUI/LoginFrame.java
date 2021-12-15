package ManagerGUI;

import com.sun.glass.events.KeyEvent;
import date.CurrentDate;
import date.CurrentTime;
import dboperation.LoginDBOperation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.Highlighter;
import staffGUI.StaffOperationFrame;

public class LoginFrame extends javax.swing.JFrame {
    public static String uname = "";
    public static String user = "";
    public static String date = new CurrentDate().getDate();

    public LoginFrame() {

        super("ERP SYSTEM");
        initComponents();

        jPasswordField1.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(22, 43, 80, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(27, 119, 75, 23);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 185, 90, 35);

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 185, 90, 35);

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(300, 185, 90, 35);

        jRadioButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton1.setText("Manager");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(120, 85, 90, 25);

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.setInheritsPopupMenu(true);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 46, 283, 25);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(120, 122, 283, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Manager or CEO Forgot Password ?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 160, 240, 16);

        jRadioButton2.setText("CEO");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(240, 90, 60, 25);

        jRadioButton3.setText("Staff");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(350, 90, 55, 25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 469;
        gridBagConstraints.ipady = 259;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(160, 450, 0, 418);
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel3.setText("\"Application best viewed at 1366x768 resolution\"");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(210, 550, 53, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        uname = jTextField1.getText().trim();
        System.out.println("uname length " + uname.length());
        String pass = jPasswordField1.getText().trim();

        if (jRadioButton1.isSelected()) {
            user = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            user = jRadioButton2.getText();
        } else if (jRadioButton3.isSelected()) {
            user = jRadioButton3.getText();
        }

        if (uname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username Cannot be Empty");

        } else if (user.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Select the User");
        }

        else if (pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password Cannot be Empty");
        }

        else if (user.equals("Manager")) {
            LoginDBOperation lc = new LoginDBOperation();

            if (lc.checkAdminLogin(uname, pass)) {
                this.dispose();
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                ManagerOperationFrame af = new ManagerOperationFrame();
                af.setVisible(true);
                af.setSize(d);

            } else {
                JOptionPane.showMessageDialog(null, "Username or Password Doesn't Match Please Try Again");

            }

        }

        else if (user.equals("Staff")) {
            LoginDBOperation lc = new LoginDBOperation();

            if (lc.checkStaffLogin(uname, pass)) {
                this.dispose();
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                StaffOperationFrame af = new StaffOperationFrame();
                af.setVisible(true);
                af.setSize(d);

            }

            else {
                JOptionPane.showMessageDialog(null, "Username and Password Doesn't Match Please Try Again");
            }

        }

    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            uname = jTextField1.getText().trim();
            String pass = jPasswordField1.getText().trim();

            if (jRadioButton1.isSelected()) {
                user = jRadioButton1.getText();
            } else if (jRadioButton2.isSelected()) {
                user = jRadioButton2.getText();
            } else if (jRadioButton3.isSelected()) {
                user = jRadioButton3.getText();
            }

            if (uname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username Cannot be Empty");

            } else if (user.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Select the User");
            }

            else if (pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password Cannot be Empty");
            }

            else if (user.equals("Manager")) {
                LoginDBOperation lc = new LoginDBOperation();

                if (lc.checkAdminLogin(uname, pass)) {
                    this.dispose();
                    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                    ManagerOperationFrame af = new ManagerOperationFrame();
                    af.setVisible(true);
                    af.setSize(d);
                    System.out.println("admin admin");
                    // count=0;
                } else {
                    JOptionPane.showMessageDialog(null, "Username and Password Doesn't Match Please Try Again");
                }

            }

            else if (user.equals("Staff")) {
                LoginDBOperation lc = new LoginDBOperation();

                if (lc.checkStaffLogin(uname, pass)) {
                    this.dispose();
                    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                    StaffOperationFrame af = new StaffOperationFrame();
                    af.setVisible(true);
                    af.setSize(d);

                } else {
                    JOptionPane.showMessageDialog(null, "Username or Password Doesn't Match Please Try Again");
                }

            }
        }

    }// GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        jTextField1.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jPasswordField1.setText("");

    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField1.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jPasswordField1.setText("");
        }
    }// GEN-LAST:event_jButton2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.exit(0);
        }
    }// GEN-LAST:event_jButton3KeyPressed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username Cannot be Empty");

        }
    }// GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);

    }// GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jRadioButton1KeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            if (jTextField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username Cannot be Empty");

            }
        }
    }// GEN-LAST:event_jRadioButton1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        String user = "";

        if (jRadioButton1.isSelected()) {
            user = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            user = jRadioButton2.getText();
        }

        if (user.isEmpty()) {

            JOptionPane.showMessageDialog(null, "User Cannot be Empty");

        }
    }// GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }// GEN-LAST:event_jPasswordField1KeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:

    }// GEN-LAST:event_jPanel1KeyPressed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jTextField1.setBorder(new EtchedBorder());

    }// GEN-LAST:event_jTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:

        Color clr = new Color(51, 161, 222);
        jTextField1.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jTextField1FocusGained

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField1MouseEntered
        // TODO add your handling code here:

        String userid = jTextField1.getText();

    }// GEN-LAST:event_jTextField1MouseEntered

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jPasswordField1.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        jPasswordField1.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jPasswordField1KeyReleased
        // TODO add your handling code here:

    }// GEN-LAST:event_jPasswordField1KeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "Please contact us from your registered email ID \n Thank you");
    }// GEN-LAST:event_jLabel4MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:

        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(true);
        jRadioButton3.setSelected(false);
    }// GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:

        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(true);

    }// GEN-LAST:event_jRadioButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
