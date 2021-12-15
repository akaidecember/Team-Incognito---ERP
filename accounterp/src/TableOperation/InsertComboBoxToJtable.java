
package TableOperation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class InsertComboBoxToJtable {
  public void getComboBoxInserted(ArrayList itemname, JTable table, String colname) {
    String[] itemslist = new String[itemname.size()];
    itemslist = (String[]) itemname.toArray(itemslist);
    JComboBox combo = new JComboBox<String>(itemslist);

    table.getColumn(colname).setCellEditor(new DefaultCellEditor(combo));

  }

}
