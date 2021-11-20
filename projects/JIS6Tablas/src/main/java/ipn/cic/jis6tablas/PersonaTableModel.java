package ipn.cic.jis6tablas;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PersonaTableModel implements TableModel {

    ArrayList<Persona> personas = new ArrayList<>();

    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void addPersona(String nombre, int edad, double peso) {
        this.personas.add(new Persona(nombre, edad, peso));
    }

    @Override
    public int getRowCount() {
        return this.personas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nombre";
            case 1:
                return "Edad";
            case 2:
                return "Peso";
            case 3:
                return "Vivo?";
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Integer.class;
            case 2:
                return Double.class;
            case 3:
                return Boolean.class;
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = this.personas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return persona.nombre;
            case 1:
                return persona.edad;
            case 2:
                return persona.peso;
            case 3:
                return persona.estaVivo;
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Persona persona = this.personas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                persona.nombre = (String)aValue;
                break;
            case 1:
                persona.edad = (Integer)aValue;
                break;
            case 2:
                persona.peso = (Double)aValue;
                break;
            case 3:
                persona.estaVivo = (Boolean)aValue;
                break;
            default:
                break;
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
