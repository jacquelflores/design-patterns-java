package org.stolen.patrones.estructurales.decorator.decoracion.cafe;
import org.stolen.patrones.estructurales.decorator.decoracion.cafe.decorador.CafeDecorator;
import org.stolen.patrones.estructurales.decorator.interfaces.Contenido;

public class CafeConAzucar extends CafeDecorator {

    public CafeConAzucar(Contenido contenido) {
        super(contenido);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + "con azucar." + "\n";
    }

    @Override
    public double costo() {
        return super.costo() + 2.0;
    }
}
