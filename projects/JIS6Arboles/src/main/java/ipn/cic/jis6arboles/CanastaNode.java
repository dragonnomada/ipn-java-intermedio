package ipn.cic.jis6arboles;

import javax.swing.tree.DefaultMutableTreeNode;

public class CanastaNode extends DefaultMutableTreeNode {

    public CanastaNode(Canasta canasta) {
        super(canasta);

        for (Fruta fruta : canasta.frutas) {
            this.add(new FrutaNode(fruta));
        }
    }

    public void addFruta(Fruta fruta) {
        Canasta canasta = (Canasta) this.getUserObject();
        canasta.addFruta(fruta);
        this.add(new FrutaNode(fruta));
    }
    
    public void addFruta(String nombre) {
        Canasta canasta = (Canasta) this.getUserObject();
        Fruta fruta = new Fruta(nombre);
        canasta.addFruta(fruta);
        this.add(new FrutaNode(fruta));
    }

}
