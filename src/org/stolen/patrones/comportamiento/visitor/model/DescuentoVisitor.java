package org.stolen.patrones.comportamiento.visitor.model;

import org.stolen.patrones.comportamiento.visitor.interfaces.Visitor;

public class DescuentoVisitor implements Visitor {

    public void visitar(Libro l) {
        System.out.println("Libro con descuento: " + (l.precio * 0.9));
    }

    public void visitar(Ropa r) {
        System.out.println("Ropa con descuento: " + (r.precio * 0.8));
    }
}
