package org.stolen.patrones.estructurales.decorator.decoracion.cafe;


import org.stolen.patrones.estructurales.decorator.decoracion.cafe.decorador.CafeDecorator;
import org.stolen.patrones.estructurales.decorator.interfaces.Contenido;

public class CafeConLeche extends CafeDecorator {

    public CafeConLeche(Contenido contenido) {
        super(contenido);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + "con leche." + "\n";
    }

    @Override
    public double costo() {
        return super.costo() + 1.5;
    }
}


