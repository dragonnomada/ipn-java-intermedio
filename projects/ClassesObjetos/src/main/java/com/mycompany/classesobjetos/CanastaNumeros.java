package com.mycompany.classesobjetos;

import java.util.ArrayList;

// Clase Genérica
// class ArrayList<T>

// ArrayList<Robot> -> ArrayRobotList
// ArrayList<Fruta> -> ArrayRobotList

public class CanastaNumeros {

    // Integer -> int | Float -> float | Double -> double
    
    private ArrayList<Integer> izquierda;
    
    private ArrayList<Integer> derecha;
    
    // CanastaNumeros canasta1 = new CanastaNumeros();
    public CanastaNumeros() {
        this.izquierda =  new ArrayList<Integer>();
        this.derecha =  new ArrayList<Integer>();
    }
    
    public void agregaNumeroParteIzquierda(Integer numero) {
        this.izquierda.add(numero);
    }
    
    public void agregaNumeroParteDerecha(Integer numero) {
        this.derecha.add(numero);
    }
    
    public void moverNumeroParteIzquierdaAParteDerecha(int indiceIzquierda, int indiceDerecha) {
        Integer numero = this.izquierda.remove(indiceIzquierda);
        this.derecha.add(indiceDerecha, numero);
    }
    
    public void moverNumeroParteDerechaAParteIzquierda(int indiceIzquierda, int indiceDerecha) {
        Integer numero = this.derecha.remove(indiceIzquierda);
        this.izquierda.add(indiceDerecha, numero);
    }
    
    public void describir() {
        this.describirIzquierda();
        
        this.describirDerecha();
        
        System.out.printf("\n");
    }

    public void describirIzquierda() {
        System.out.printf("I[ ");
        for (Integer numero : this.izquierda) {
            System.out.printf("%d ", numero);
        }
        System.out.printf("] ");
    }

    public void describirDerecha() {
        System.out.printf("D[ ");
        for (Integer numero : this.derecha) {
            System.out.printf("%d ", numero);
        }
        System.out.printf("] ");
    }
    
    public static void main(String[] args) {
        CanastaNumeros canasta = new CanastaNumeros();
        
        canasta.describir();
        
        canasta.agregaNumeroParteIzquierda(23);
        
        canasta.describir();
        
        canasta.agregaNumeroParteDerecha(45);
        
        canasta.describir();
        
        canasta.agregaNumeroParteIzquierda(17);
        
        canasta.describir();
        
        canasta.moverNumeroParteIzquierdaAParteDerecha(1, 0);
        
        canasta.describir();
    }
    
}
