
package TableOperation;

import java.awt.Button;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class InsertEditButtonDataToTable {

    public void getButtonDataInserted(JTable table, int cnumber, ArrayList info) {

        DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        int x = table.getColumnCount();
        for (int i = 0; i < x; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(rendar);
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.setRowHeight(30);
        table.getColumn("Edit").setCellRenderer(new ButtonCell());
        table.getColumn("Edit").setCellEditor(new ButtonCell());

        Object rowData[] = new Object[cnumber];
        model.setRowCount(0);

        Icon icon = new ImageIcon(getClass().getResource("/bahikhata/editicon.png"));

        for (int i = 0; i < info.size(); i++) {

            ArrayList temp = (ArrayList) info.get(i);

            for (int j = 0; j < temp.size(); j++) {
                String str = (String) temp.get(j);
                rowData[j] = str;
            }

            rowData[rowData.length - 1] = icon;
            model.addRow(rowData);

        }

    }

}
