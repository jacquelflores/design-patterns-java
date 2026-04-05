package org.stolen.patrones.comportamiento.templateMethod.model;

public class Cafe extends Bebida{
    @Override
    void agregarIngrediente() {
        System.out.println("Agregando Café.");
    }
}
