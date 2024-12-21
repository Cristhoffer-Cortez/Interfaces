package com.mycompany.interfaces;

public class Interfaces {

    public static void main(String[] args) {
        
        Perro perro =new Perro();
        Gato gato =new Gato();
        
        perro.HacerSonido();
        perro.Amamantar();
        
        System.out.println("");
        
        gato.HacerSonido();
        gato.Amamantar();
        
    }
}
