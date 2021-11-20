package ipn.cic.jis6tablas;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class NombreEdadPesoTableModel implements TableModel {

    private ArrayList<String> nombres = new ArrayList<>();
    private ArrayList<Integer> edades = new ArrayList<>();
    private ArrayList<Double> pesos = new ArrayList<>();
    
    public void addRecord(String nombre, int edad, double peso) {
        this.nombres.add(nombre);
        this.edades.add(edad);
        this.pesos.add(peso);
    }
    
    @Override
    public int getRowCount() {
        return this.nombres.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0: return "Nombre";
            case 1: return "Edad";
            case 2: return "Peso";
            default: return "ERROR";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return String.class;
            case 1: return Integer.class;
            case 2: return Double.class;
            default: return Object.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return this.nombres.get(rowIndex);
            case 1: return this.edades.get(rowIndex);
            case 2: return this.pesos.get(rowIndex);
            default: return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: this.nombres.set(rowIndex, (String)aValue); break;
            case 1: this.edades.set(rowIndex, (Integer)aValue); break;
            case 2: this.pesos.set(rowIndex, (Double)aValue); break;
            default: break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }
    
}
