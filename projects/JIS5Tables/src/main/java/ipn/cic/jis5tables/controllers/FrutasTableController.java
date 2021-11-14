package ipn.cic.jis5tables.controllers;

import ipn.cic.jis5tables.models.Fruta;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class FrutasTableController implements TableModel {

    ArrayList<Fruta> frutas = new ArrayList<Fruta>();
    
    ArrayList<TableModelListener> listeners = new ArrayList<TableModelListener>();
    
    public FrutasTableController() {
        Fruta f1 = new Fruta();
        f1.setNombre("manzana");
        f1.setPrecio(42.5);
        f1.setCantidad(12);
        frutas.add(f1);
        Fruta f2 = new Fruta();
        f2.setNombre("mango");
        f2.setPrecio(67);
        f2.setCantidad(3);
        frutas.add(f2);
    }
    
    @Override
    public int getRowCount() {
        return this.frutas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 0: return "Nombre";
            case 1: return "Precio ($ x KG)";
            case 2: return "Cantidad (KG)";
            default: return "DESCONOCIDO";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0: return String.class;
            case 1: return Double.class;
            case 2: return Double.class;
            default: return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fruta fruta = this.frutas.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return fruta.getNombre();
            case 1: return fruta.getPrecio();
            case 2: return fruta.getCantidad();
            default: return "ERROR: INVALID COLUMN";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Fruta fruta = this.frutas.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                fruta.setNombre((String)aValue);
                break;
            case 1:
                fruta.setPrecio((Double)aValue);
                break;
            case 2:
                fruta.setCantidad((Double)aValue);
                break;
            default:
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        this.listeners.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        this.listeners.remove(l);
    }
    
}
