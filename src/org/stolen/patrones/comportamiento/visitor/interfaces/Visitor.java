package org.stolen.patrones.comportamiento.visitor.interfaces;

import org.stolen.patrones.comportamiento.visitor.model.Libro;
import org.stolen.patrones.comportamiento.visitor.model.Ropa;

public interface Visitor {
    void visitar(Libro l);

    void visitar(Ropa r);
}
