
package TableOperation;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

public class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        this.setText((String) value);
        this.setWrapStyleWord(true);
        this.setLineWrap(true);

        int fontHeight = this.getFontMetrics(this.getFont()).getHeight();
        int textLength = this.getText().length();
        int lines = textLength / this.getColumnWidth();
        if (lines == 0) {
            lines = 1;
        }

        int height = fontHeight * lines;
        table.setRowHeight(row, height);

        return this;
    }

}
