
package TableOperation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class InsertCheckBoxToJtable {
  public void getCheckBoxInserted(JTable table, String colname) {

    JCheckBox check = new JCheckBox("Selected", true);
    table.getColumn(colname).setCellRenderer(new CheckBoxRenderer());

  }

}
