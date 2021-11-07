package ipn.cic.s5herencia;

import java.util.ArrayList;

public class App5 {

    static ArrayList<Integer> grafica(Contador contador, int a, int b) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        
        for (int i = a; i <= b; i++) {
            contador.incrementar();
            valores.add(contador.getConteo());
        }
        
        return valores;
    }
    
    public static void main(String[] args) {
        
        Contador contador1 = new Contador();
        ContadorNombrado contador2 = new ContadorNombrado("dos");
        ContadorAleatorio contador3 = new ContadorAleatorio(-10, 10);
        
        ArrayList<Integer> g1 = grafica(contador1, 1, 10);
        ArrayList<Integer> g2 = grafica(contador2, 1, 10);
        ArrayList<Integer> g3 = grafica(contador3, 1, 10);
        
        contador1.describir();
        for (Integer valor : g1) {
            System.out.printf("%d ", valor);
        }
        System.out.println();
        
        contador2.describir();
        for (Integer valor : g2) {
            System.out.printf("%d ", valor);
        }
        System.out.println();
        
        contador3.describir();
        for (Integer valor : g3) {
            System.out.printf("%d ", valor);
        }
        System.out.println();
        
    }
    
}
