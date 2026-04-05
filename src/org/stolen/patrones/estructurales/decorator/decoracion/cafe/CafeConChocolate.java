package org.stolen.patrones.estructurales.decorator.decoracion.cafe;

import org.stolen.patrones.estructurales.decorator.decoracion.cafe.decorador.CafeDecorator;
import org.stolen.patrones.estructurales.decorator.interfaces.Contenido;

public class CafeConChocolate extends CafeDecorator {

    public CafeConChocolate(Contenido contenido) {
        super(contenido);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + "con chocolate." + "\n";
    }

    @Override
    public double costo() {
        return super.costo() + 3.5;
    }
}
