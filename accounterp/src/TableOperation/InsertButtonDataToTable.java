
package TableOperation;

import java.awt.Button;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class InsertButtonDataToTable {

    public void getButtonDataInserted(JTable table, int cnumber, ArrayList info) {

        DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
        rendar.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        int x = table.getColumnCount();
        for (int i = 0; i < x; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(rendar);
        }

        table.getColumn("Edit").setCellRenderer(new ButtonCell());
        table.getColumn("Edit").setCellEditor(new ButtonCell());

        table.getColumn("Delete").setCellRenderer(new ButtonCell());
        table.getColumn("Delete").setCellEditor(new ButtonCell());

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        table.setRowHeight(30);

        Object rowData[] = new Object[cnumber];

        Icon icon1 = new ImageIcon(getClass().getResource("/bahikhata/editicon.png"));
        Icon icon2 = new ImageIcon(getClass().getResource("/bahikhata/deleteicon.png"));

        for (int i = 0; i < info.size(); i++) {

            ArrayList temp = (ArrayList) info.get(i);

            for (int j = 0; j < temp.size(); j++) {
                String str = (String) temp.get(j);
                rowData[j] = str;
            }

            rowData[rowData.length - 2] = icon1;
            rowData[rowData.length - 1] = icon2;
            model.addRow(rowData);
        }

    }

}
