package ipn.cic.jis6arbolproductos;

import javax.swing.tree.DefaultMutableTreeNode;

public class ProductoNodo extends DefaultMutableTreeNode {
    
    public ProductoNodo(String nombre) {
        super(nombre);
    }
    
    public LineaNodo addLinea(String nombre) {
        LineaNodo nodo = new LineaNodo(nombre);
        this.add(nodo);
        return nodo;
    }
    
}
