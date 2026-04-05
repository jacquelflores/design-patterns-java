package org.stolen.patrones.comportamiento.visitor.model;

import org.stolen.patrones.comportamiento.visitor.interfaces.Producto;
import org.stolen.patrones.comportamiento.visitor.interfaces.Visitor;

public class Ropa implements Producto {
    int precio = 100;

    @Override
    public void aceptar(Visitor v) {
        v.visitar(this);
    }
}
