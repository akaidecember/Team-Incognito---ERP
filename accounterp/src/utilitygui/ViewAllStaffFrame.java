/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitygui;

//import static healthprediction.LoginFrame.userid;



import TableOperation.InsertDataToTable;
import TableOperation.InsertEditButtonDataToTable;
import TableOperation.InsertEditButtonDataToTable;

import dboperation.ManageProfileDBOperation;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


/**
 *
 * @author welcome
 */
public class ViewAllStaffFrame extends javax.swing.JFrame {
   // private Button button;
    
 

    /**
     * Creates new form ViewUploadFileFrame
     */
    public ViewAllStaffFrame() {
        
        super ("VIEW ALL STAFF DETAILS Login By"+" "+LoginFrame.uname);
        initComponents();

       
       ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer())
           .setHorizontalAlignment((int) TOP_ALIGNMENT);
       
       TableColumnModel columnModel = jTable1.getColumnModel();
       
       
       columnModel.getColumn(0).setPreferredWidth(100);
       columnModel.getColumn(1).setPreferredWidth(100);
       columnModel.getColumn(2).setPreferredWidth(100);
       columnModel.getColumn(3).setPreferredWidth(150);
       columnModel.getColumn(6).setPreferredWidth(200);
      // columnModel.getColumn(7).setPreferredWidth(200);
       
       
      
        
        
         jTable1.setRowHeight(35);
        
   
             int rowheight=35;
             ArrayList staffinfo=new ManageProfileDBOperation().getAllStaffInfo();
             
             //int rows = jTable1.getRowCount();
           //  int columns= jTable1.getColumnCount();
            // System.out.println("Rows  "+rows);
            // System.out.println("columns  "+columns);
             
            if(staffinfo.size()<=5)
             {
                 for (int i = 0; i < staffinfo.size(); i++) 
                 {

                     ArrayList temp = (ArrayList) staffinfo.get(i);

                     for (int j = 0; j < temp.size(); j++) 
                     {
                         String str = (String) temp.get(j);

                         jTable1.setValueAt(str, i, j);
                     }

                 }
             }
            else
            {
                
                InsertDataToTable it = new InsertDataToTable();
                it.getDataInserted(jTable1, jTable1.getColumnCount(), staffinfo, rowheight);
                
            }


            
           
                        
          
//         }
        
        
       
         
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "DOB", "Mobile Number", "Email ID", "Username", "Password", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(1);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 1230, 200);

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editcompany.png"))); // NOI18N
        jButton2.setText("Edit");
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
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 560, 90, 35);

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
        getContentPane().add(jButton4);
        jButton4.setBounds(165, 560, 90, 35);

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        javax.swing.ToolTipManager.sharedInstance().setInitialDelay(1);
       // javax.swing.ToolTipManager.sharedInstance().setDismissDelay(1);
        
        String str=(String) jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
       // System.out.println("Tool Tip Text is "+str);
        jTable1.setToolTipText(str);
      
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_TAB)
        {
            int row=jTable1.getRowCount();
            int col=jTable1.getColumnCount();
            
            if (evt.getModifiers() > 0) 
            {
                        jTable1.transferFocusBackward();
                    } else {
                        jTable1.transferFocus();
                    }
                    evt.consume();
        }
       
    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int row = jTable1.getSelectedRow();
        //  System.out.println("row: "+index1);

        if(row==-1)
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }
        else if(row!=-1)
        {

            String username = (String) jTable1.getValueAt(row, 4);
            EditStaffFrame.uname = username;
            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            EditStaffFrame sf = new EditStaffFrame();
            sf.setVisible(true);
            sf.setSize(d);

        

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            int row = jTable1.getSelectedRow();
        //  System.out.println("row: "+index1);

        if(row==-1)
        {
            JOptionPane.showMessageDialog(null, "Please Select The Row");
        }
        else if(row!=-1)
        {

            String sname = (String) jTable1.getValueAt(row, 0);
            EditStaffFrame.uname = sname;
            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            EditStaffFrame sf = new EditStaffFrame();
            sf.setVisible(true);
            sf.setSize(d);

        

        }
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

             {
            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            ManagerOperationFrame af = new ManagerOperationFrame();
            af.setVisible(true);
            af.setSize(d);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {

            if(LoginFrame.user.equals("Staff"))
            {

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

            }
            else
            {
                this.dispose();
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                ManagerOperationFrame af = new ManagerOperationFrame();
                af.setVisible(true);
                af.setSize(d);

            }
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        if(LoginFrame.user.equals("Staff"))
        {

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

        }
        else
        {
            this.dispose();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            ManagerOperationFrame af = new ManagerOperationFrame();
            af.setVisible(true);
            af.setSize(d);

        }
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8KeyPressed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        lf.setSize(d);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllStaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
