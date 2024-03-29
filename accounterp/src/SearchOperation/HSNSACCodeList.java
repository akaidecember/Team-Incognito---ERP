
package SearchOperation;

import TableOperation.InsertDataToTable;
import TableOperation.InsertHSNDataToTable;
import dboperation.HSNSACCODEDBOperation;

import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import staffGUI.AddItemFrame;

public class HSNSACCodeList extends javax.swing.JFrame {

    public static String tablename = "";
    public TableRowSorter<TableModel> sorter = null;

    /**
     * Creates new form HSNSACCode
     */
    public HSNSACCodeList() {
        super("HSN SAC CODE LIST");
        initComponents();
        ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment((int) TOP_ALIGNMENT);

        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableColumnModel colModel = jTable1.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(35);
        colModel.getColumn(1).setPreferredWidth(1000);

        int rowheight = 40;
        ArrayList hsncodelist = new HSNSACCODEDBOperation().getAllHSNSACCode(tablename);
        int columncount = jTable1.getColumnCount();
        InsertHSNDataToTable it = new InsertHSNDataToTable();
        it.getDataInserted(jTable1, columncount, hsncodelist, rowheight);

        DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment(LEFT);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(rendar);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rendar);
        sorter = new TableRowSorter<>(((DefaultTableModel) jTable1.getModel()));
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
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

            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(380, 20, 565, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Description");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 80, 120, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Item Code", "Description"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 1280, 570);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/select.png"))); // NOI18N
        jButton1.setText("Select");
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
        jButton1.setBounds(980, 60, 90, 30);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(380, 70, 560, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText(" Item Code");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 20, 120, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 1320, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyReleased

        System.out.println("Searching by Itemcode");
        String sword = jTextField1.getText();
        sword = sword.trim();

        sorter.setRowFilter(RowFilter.regexFilter(sword, 0));
        jTable1.setRowSorter(sorter);

    }// GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here
        // String sword=jTextField1.getText();
        // sword=sword.trim();
        //
        // TableRowSorter<TableModel> sorter = new
        // TableRowSorter<TableModel>(((DefaultTableModel) jTable1.getModel()));
        // sorter.setRowFilter(RowFilter.regexFilter("(?i)" + sword));
        // sorter.setRowFilter(RowFilter.regexFilter(sword, 0));
        // jTable1.setRowSorter(sorter);
    }// GEN-LAST:event_jTextField1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        int index1 = jTable1.getSelectedRow();

        String code = (String) jTable1.getValueAt(index1, 0);
        jTextField1.setText(code);

        javax.swing.ToolTipManager.sharedInstance().setInitialDelay(1);

        String str = (String) jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
        // System.out.println("Tool Tip Text is "+str);
        jTable1.setToolTipText(str);

    }// GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddItemFrame.jTextField6.setText(jTextField1.getText());

        this.dispose();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            AddItemFrame.jTextField6.setText(jTextField1.getText());
            this.dispose();
        }
    }// GEN-LAST:event_jButton1KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:

        System.out.println("Searching by Description");
        String code = jTextField1.getText();
        String sword = jTextField2.getText();
        sword = sword.trim();
        sorter.setRowFilter(RowFilter.regexFilter(code, 0));

        sorter.setRowFilter(RowFilter.regexFilter(sword, 1));

        jTable1.setRowSorter(sorter);

        // ;;;;;;

    }// GEN-LAST:event_jTextField2KeyReleased

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
            java.util.logging.Logger.getLogger(HSNSACCodeList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HSNSACCodeList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HSNSACCodeList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HSNSACCodeList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HSNSACCodeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
