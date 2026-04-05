package org.stolen.patrones.comportamiento.visitor.model;

import org.stolen.patrones.comportamiento.visitor.interfaces.Producto;
import org.stolen.patrones.comportamiento.visitor.interfaces.Visitor;

public class Libro implements Producto {
    int precio = 50;

    @Override
    public void aceptar(Visitor v) {
        v.visitar(this);
    }
}
