package purchase;

import javax.swing.JTable;

public class EmptyRowIdentifier {
    public int getEmptyRows(JTable table) {
        int emptyRows = 0;
        rowSearch: for (int row = 0; row < table.getRowCount(); row++) {
            for (int col = 0; col < table.getColumnCount(); col++) {
                if (table.getValueAt(row, col) != null) {
                    continue rowSearch;
                }
            }
            emptyRows++;
        }
        return emptyRows;
    }
}
