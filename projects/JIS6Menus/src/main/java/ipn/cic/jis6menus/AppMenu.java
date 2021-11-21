package ipn.cic.jis6menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AppMenu extends JMenuBar {

    public AppMenu() {
        
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuHerramientas = new JMenu("Herramientas");
        JMenu menuOpciones = new JMenu("Opciones");
        JMenu menuOpcionesAvanzadas = new JMenu("Avanzado");
        JMenu menuAyuda = new JMenu("Ayuda");
        
        JMenuItem itemArchivoNuevo = new JMenuItem("Nuevo");
        JMenuItem itemArchivoAbrir = new JMenuItem("Abrir");
        JMenuItem itemArchivoCerrar = new JMenuItem("Cerrar");
        JMenuItem itemArchivoImprimir = new JMenuItem("Imprimir");
        JMenuItem itemArchivoSalir = new JMenuItem("Salir");
        
        ItemArchivoNuevoController itemArchivoNuevoController = new ItemArchivoNuevoController(itemArchivoNuevo);
        itemArchivoNuevo.addActionListener(itemArchivoNuevoController);
        
        itemArchivoAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(menuArchivo, "Abrir", "Abrir archivo", JOptionPane.WARNING_MESSAGE);
            }
        });
        
        menuArchivo.add(itemArchivoNuevo);
        menuArchivo.add(itemArchivoAbrir);
        menuArchivo.add(itemArchivoCerrar);
        menuArchivo.add(itemArchivoImprimir);
        menuArchivo.add(itemArchivoSalir);
        
        JMenuItem itemHeramientaCortar = new JMenuItem("Cortar");
        JMenuItem itemHeramientaCopiar = new JMenuItem("Copiar");
        JMenuItem itemHeramientaPegar = new JMenuItem("Pegar");
        
        menuHerramientas.add(itemHeramientaCortar);
        menuHerramientas.add(itemHeramientaCopiar);
        menuHerramientas.add(itemHeramientaPegar);
        
        JMenuItem itemOpcionesEstilos = new JMenuItem("Estilos");
        JMenuItem itemOpcionesFuentes = new JMenuItem("Fuentes");
        
        menuOpciones.add(itemOpcionesEstilos);
        menuOpciones.add(itemOpcionesFuentes);
        
        JMenuItem itemOpcionesAvanzadasScripts = new JMenuItem("Scripts");
        JMenuItem itemOpcionesAvanzadasConsola = new JMenuItem("Consola");
        
        menuOpcionesAvanzadas.add(itemOpcionesAvanzadasScripts);
        menuOpcionesAvanzadas.add(itemOpcionesAvanzadasConsola);
        
        menuOpciones.add(menuOpcionesAvanzadas);
        
        JMenuItem itemAyudaAcercaDe = new JMenuItem("Acerca De");
        
        menuAyuda.add(itemAyudaAcercaDe);
        
        this.add(menuArchivo);
        this.add(menuHerramientas);
        this.add(menuOpciones);
        this.add(menuAyuda);
    }
    
}
