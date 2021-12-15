
package TableOperation;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class CheckBoxRenderer extends JCheckBox implements TableCellRenderer {

  CheckBoxRenderer() {
    setHorizontalAlignment(JLabel.CENTER);
  }

  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {

    Object valueInColumn1 = table.getValueAt(row, 1);
    if (valueInColumn1 == null) {
      JLabel x = new JLabel();
      return x;
    }
    setSelected((value != null && ((Boolean) value).booleanValue()));
    return this;
  }

}