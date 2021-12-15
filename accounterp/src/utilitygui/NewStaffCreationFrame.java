
package utilitygui;

import date.CurrentDate;
import date.CurrentTime;
import dbdriver.DBDriver;
import dboperation.ManageProfileDBOperation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import validation.Validator;

public class NewStaffCreationFrame extends javax.swing.JFrame {

    public String email = "No Emailid";

    /**
     * Creates new form LoginFrame
     */
    public NewStaffCreationFrame() {

        super("NEW STAFF CREATION Login By" + " " + LoginFrame.uname);
        initComponents();

        jPasswordField1.setText("");
        jPasswordField2.setText("");

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(27, 35, 49, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("DOB:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(27, 81, 38, 23);

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 38, 450, 25);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Mob No:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(27, 124, 65, 23);

        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 124, 450, 25);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Email Id:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(27, 167, 63, 23);

        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(200, 170, 450, 25);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(27, 213, 80, 23);

        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(200, 216, 450, 25);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Confirm Password:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(27, 305, 138, 23);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(200, 262, 450, 25);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(27, 259, 75, 23);

        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(200, 308, 450, 25);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButton1.setText("Save");
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
        jButton1.setBounds(255, 376, 90, 35);

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(363, 376, 90, 35);

        jLabel33.setText("[ dd/mm/yyyy]");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(80, 81, 100, 16);

        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(200, 80, 450, 25);

        jLabel34.setText("(Optional)");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(100, 172, 60, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 40, 700, 430);

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(479, 50));

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homecompany.png"))); // NOI18N
        jMenu8.setText("Home");
        jMenu8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu8KeyPressed(evt);
            }
        });
        jMenuBar2.add(jMenu8);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jMenu6.setText("Logout");
        jMenu6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        jMenuItem12.setText("Exit");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();

        String mob = jTextField2.getText();
        String emailid = jTextField3.getText();
        String uname = jTextField4.getText();
        String pass = jPasswordField1.getText();
        String cpass = jPasswordField2.getText();

        // System.out.println("Date: "+d);

        if (emailid.length() == 0) {
            emailid = email;
        }

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name Cannot be Empty");

        }

        else if (mob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mobile Number Cannot be Empty");
        } else if (mob.length() != 10) {
            JOptionPane.showMessageDialog(null, "Mobile Number should be of 10 Digits");
        } else if (Validator.isDigitMobileno(mob) == false) {
            JOptionPane.showMessageDialog(null, "Mobile Number is not Valid Please Try Again");
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email ID Cannot be Empty");

        } else if (!emailid.equals("No Emailid") && !emailid.contains("@")) {
            JOptionPane.showMessageDialog(null, "Email ID does not contains '@' Please try Again");

        } else if (!emailid.equals("No Emailid") && !emailid.contains(".")) {
            JOptionPane.showMessageDialog(null, "Email ID does not contains '.' Please try Again");

        } else if (uname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username Cannot be Empty");

        } else if (!isValidName(uname)) {
            JOptionPane.showMessageDialog(null,
                    "Username contain  a character otherthan Alphanumeric \n Please Enter a valid Username");
        } else if (uname.length() > 10) {
            JOptionPane.showMessageDialog(null, "Username Length should be less than 10 Characters");
        }

        else if (pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password Cannot be Empty");

        } else if (cpass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Confirm Password Cannot be Empty");
        } else if (!cpass.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Password and Confirm Password Doesn't Match, Please Try Again");
        } else {

            String dob = jTextField5.getText();
            String date = new CurrentDate().getDate();
            String time = new CurrentTime().getTime();
            String datetime = date + " " + time;

            ManageProfileDBOperation md = new ManageProfileDBOperation();
            if (md.createNewStaff(name, dob, mob, emailid, uname, pass, datetime, LoginFrame.uname, LoginFrame.date)) {
                JOptionPane.showMessageDialog(null, "New Staff Information Saved Successfully");
                jTextField1.setText("");
                jTextField5.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jPasswordField1.setText("");
                jPasswordField2.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "Problem Occured in Database operation \n Please Try Again");
            }

            // System.out.println("Name "+name);
            // System.out.println("DOB: "+dob);
            // System.out.println("Mobile: "+mob);
            // System.out.println("Email: "+email);
            // System.out.println("Username: "+uname);
            // System.out.println("Passoword: "+pass);
            // System.out.println("Confirm Passoword: "+cpass);
            // System.out.println("Date and Time: "+datetime);
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    public boolean isValidName(String name) {
        boolean flag = true;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int x = (int) ch;

            if ((x >= 48 && x <= 57) || (x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        {
            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            ManagerOperationFrame af = new ManagerOperationFrame();
            af.setVisible(true);
            af.setSize(d);

        }

    }// GEN-LAST:event_jButton4ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextField1.getText();

            String mob = jTextField2.getText();
            String emailid = jTextField3.getText();
            String uname = jTextField4.getText();
            String pass = jPasswordField1.getText();
            String cpass = jPasswordField2.getText();

            // System.out.println("Date: "+d);

            if (emailid.length() == 0) {
                emailid = email;
            }

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name Cannot be Empty");

            }

            else if (mob.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mobile Number Cannot be Empty");
            } else if (mob.length() != 10) {
                JOptionPane.showMessageDialog(null, "Mobile Number should be of 10 Digits");
            } else if (Validator.isDigitMobileno(mob) == false) {
                JOptionPane.showMessageDialog(null, "Mobile Number is not Valid Please Try Again");
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email ID Cannot be Empty");

            } else if (!emailid.equals("No Emailid") && !emailid.contains("@")) {
                JOptionPane.showMessageDialog(null, "Email ID does not contains '@' Please try Again");

            } else if (!emailid.equals("No Emailid") && !emailid.contains(".")) {
                JOptionPane.showMessageDialog(null, "Email ID does not contains '.' Please try Again");

            } else if (uname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username Cannot be Empty");

            } else if (!isValidName(uname)) {
                JOptionPane.showMessageDialog(null,
                        "Username contain  a character otherthan Alphanumeric \n Please Enter a valid User name");
            } else if (uname.length() > 10) {
                JOptionPane.showMessageDialog(null, "Username Length should be less than 10 Characters");
            }

            else if (pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password Cannot be Empty");

            } else if (cpass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Confirm Password Cannot be Empty");
            } else if (!cpass.equals(pass)) {
                JOptionPane.showMessageDialog(null, "Password and Confirm Password Doesn't Match Please Try Again");
            } else {

                String dob = jTextField5.getText();
                String date = new CurrentDate().getDate();
                String time = new CurrentTime().getTime();
                String datetime = date + " " + time;

                ManageProfileDBOperation md = new ManageProfileDBOperation();
                if (md.createNewStaff(name, dob, mob, emailid, uname, pass, datetime, LoginFrame.uname,
                        LoginFrame.date)) {
                    JOptionPane.showMessageDialog(null, "New Staff Information Saved Successfully");
                    jTextField1.setText("");
                    jTextField5.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Problem Occured in Database operation \n Please Try Again");
                }

                // System.out.println("Name "+name);
                // System.out.println("DOB: "+dob);
                // System.out.println("Mobile: "+mob);
                // System.out.println("Email: "+email);
                // System.out.println("Username: "+uname);
                // System.out.println("Passoword: "+pass);
                // System.out.println("Confirm Passoword: "+cpass);
                // System.out.println("Date and Time: "+datetime);
            }

        }

    }// GEN-LAST:event_jButton1KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (LoginFrame.user.equals("Staff")) {

                this.dispose();
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                ManagerOperationFrame af = new ManagerOperationFrame();
                af.setVisible(true);
                af.setSize(d);
                af.jLabel3.setEnabled(false);
                af.jLabel4.setEnabled(false);
                af.jLabel5.setEnabled(false);
                af.jLabel6.setEnabled(false);
                af.jLabel7.setEnabled(false);
                af.jLabel8.setEnabled(false);

            } else {
                this.dispose();
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                ManagerOperationFrame af = new ManagerOperationFrame();
                af.setVisible(true);
                af.setSize(d);

            }
        }
    }// GEN-LAST:event_jButton4KeyPressed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:

        Color clr = new Color(51, 161, 222);
        jTextField1.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jTextField1.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField2.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        jTextField2.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField3.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        jTextField3.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField4.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        jTextField4.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jTextField4FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jPasswordField1.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        jPasswordField1.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField2FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jPasswordField2.setBorder(new LineBorder(clr, 2));
    }// GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField2FocusLost
        // TODO add your handling code here:
        jPasswordField2.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jPasswordField2FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51, 161, 222);
        jTextField5.setBorder(new LineBorder(clr, 2));
        jTextField5.setFocusTraversalKeysEnabled(false);
    }// GEN-LAST:event_jTextField5FocusGained

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        String str = jTextField5.getText();
        if (str.contains(".") || str.contains("-")) {
            str = str.replace(".", "/");
            str = str.replace("-", "/");

        }

        jTextField5.setText(str);

    }// GEN-LAST:event_jTextField5KeyReleased

    public String isValidDate(String str) {
        String result = "";
        try {
            int x = Integer.parseInt(str);
            if (x > 31) {
                result = "Invalid Date \n Please Re enter ";
            }
        } catch (Exception ex) {
            result = "Date is not a Number";
            System.out.println("Exception ex " + ex);
        }
        return result;
    }

    public String isValidMonth(String str) {
        String result = "";
        try {
            int x = Integer.parseInt(str);
            if (x > 12) {
                result = "Invalid Month \n Please Re enter ";
            }
        } catch (Exception ex) {
            result = "Month is not a Number";
            System.out.println("Exception ex " + ex);
        }

        return result;
    }

    public String isValidYear(String str) {
        String result = "";
        try {
            int x = Integer.parseInt(str);
            // if(x>12)
            // {
            // result="Invalid Month \n Please Re enter ";
            // }
        } catch (Exception ex) {
            result = "Year is not a Number";
            System.out.println("Exception ex " + ex);
        }

        return result;
    }

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_TAB) {
            String str = jTextField5.getText();
            if (!str.isEmpty()) {
                String st[] = str.split("/");
                if (st.length == 3) {
                    String st1 = st[0];
                    String st2 = st[1];
                    String st3 = st[2];
                    String result1 = isValidDate(st1);
                    String result2 = isValidMonth(st2);
                    String result3 = isValidYear(st3);
                    if (!result1.isEmpty())
                        JOptionPane.showMessageDialog(null, result1);

                    if (!result2.isEmpty())
                        JOptionPane.showMessageDialog(null, result2);
                    if (!result3.isEmpty())
                        JOptionPane.showMessageDialog(null, result3);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Date can not be Empty");
            }
            jTextField5.setFocusTraversalKeysEnabled(true);
        }

    }// GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        jTextField5.setBorder(new EtchedBorder());
    }// GEN-LAST:event_jTextField5FocusLost

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        if (LoginFrame.user.equals("Staff")) {

            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            ManagerOperationFrame af = new ManagerOperationFrame();
            af.setVisible(true);
            af.setSize(d);
            af.jLabel3.setEnabled(false);
            af.jLabel4.setEnabled(false);
            af.jLabel5.setEnabled(false);
            af.jLabel6.setEnabled(false);
            af.jLabel7.setEnabled(false);
            af.jLabel8.setEnabled(false);

        } else {
            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            ManagerOperationFrame af = new ManagerOperationFrame();
            af.setVisible(true);
            af.setSize(d);

        }
    }// GEN-LAST:event_jMenu8MouseClicked

    private void jMenu8KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jMenu8KeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenu8KeyPressed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }// GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(NewStaffCreationFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStaffCreationFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStaffCreationFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStaffCreationFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStaffCreationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
