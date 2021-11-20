package ipn.cic.jis6tablas;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class CustomTableModel implements TableModel {

    int rowCount;
    
    public CustomTableModel(int rows) {
        this.rowCount = rows;
    }   
    
    @Override
    public int getRowCount() {
        return this.rowCount;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return String.format("Columna %d", columnIndex);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return String.format("Celda %d, %d", rowIndex, columnIndex);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // No actualiza el valor
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        // No hace nada
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // No hace nada
    }
    
}
