package ipn.cic.jis6arbolproductos;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTree;

public class App {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        ProductosArbol arbol = new ProductosArbol();
        
        ProductoNodo nike = arbol.addProducto("Nike");
        ProductoNodo adidas = arbol.addProducto("Adidas");
        ProductoNodo rebook = arbol.addProducto("Rebook");
        
        LineaNodo ropaNike = nike.addLinea("Ropa");
        LineaNodo tenisNike = nike.addLinea("Tenis");
        LineaNodo gorrasNike = nike.addLinea("Gorras");
        
        TallaNodo chicaRopaNike = ropaNike.addTalla("Chica");
        TallaNodo medianaRopaNike = ropaNike.addTalla("Mediana");
        TallaNodo GrandeRopaNike = ropaNike.addTalla("Grande");
        
        LineaNodo ropaAdidas = adidas.addLinea("Ropa");
        LineaNodo tenisAdidas = adidas.addLinea("Tenis");
        LineaNodo gorrasAdidas = adidas.addLinea("Gorras");
        
        TallaNodo chicaRopaAdidas = ropaAdidas.addTalla("Chica");
        TallaNodo medianaRopaAdidas = ropaAdidas.addTalla("Mediana");
        TallaNodo GrandeRopaAdidas = ropaAdidas.addTalla("Grande");
        
        LineaNodo tenisRebook = rebook.addLinea("Tenis");
        
        TallaNodo r65TenisRebook = tenisRebook.addTalla("R65");
        TallaNodo jordanTenisRebook = tenisRebook.addTalla("Jordan");
        TallaNodo dennisTenisRebook = tenisRebook.addTalla("Dennis");

        frame.setLayout(new BorderLayout());

        frame.add(arbol, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
