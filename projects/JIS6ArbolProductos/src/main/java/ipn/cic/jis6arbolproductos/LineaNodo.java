package ipn.cic.jis6arbolproductos;

import javax.swing.tree.DefaultMutableTreeNode;

public class LineaNodo extends DefaultMutableTreeNode {
    
    public LineaNodo(String nombre) {
        super(nombre);
    }
    
    public TallaNodo addTalla(String nombre) {
        TallaNodo nodo = new TallaNodo(nombre);
        this.add(nodo);
        return nodo;
    }
    
}
