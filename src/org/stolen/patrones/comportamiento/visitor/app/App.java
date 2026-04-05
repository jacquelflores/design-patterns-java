package org.stolen.patrones.comportamiento.visitor.app;

import org.stolen.patrones.comportamiento.visitor.interfaces.Producto;
import org.stolen.patrones.comportamiento.visitor.interfaces.Visitor;
import org.stolen.patrones.comportamiento.visitor.model.DescuentoVisitor;
import org.stolen.patrones.comportamiento.visitor.model.Libro;
import org.stolen.patrones.comportamiento.visitor.model.Ropa;

public class App {
    public static void main(String[] args) {
        Producto libro = new Libro();
        Producto ropa = new Ropa();

        Visitor descuento = new DescuentoVisitor();

        libro.aceptar(descuento);
        ropa.aceptar(descuento);
    }
}
