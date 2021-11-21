package ipn.cic.jis6arbolproductos;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ProductosArbol extends JTree {
   
    public ProductosArbol() {
        super(new DefaultMutableTreeNode("Productos"));
    }
    
    public ProductoNodo addProducto(String nombre) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)this.getModel().getRoot();
        
        ProductoNodo nodo = new ProductoNodo(nombre);
        root.add(nodo);
        return nodo;
    }
    
}
