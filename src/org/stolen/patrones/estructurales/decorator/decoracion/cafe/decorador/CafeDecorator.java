package org.stolen.patrones.estructurales.decorator.decoracion.cafe.decorador;


import org.stolen.patrones.estructurales.decorator.interfaces.Contenido;

public abstract class CafeDecorator implements Contenido {
    protected Contenido contenido;

    public CafeDecorator(Contenido contenido) {
        this.contenido = contenido;
    }

    @Override
    public String descripcion() {
        return  this.contenido.descripcion();
    }

    @Override
    public double costo() {
        return this.contenido.costo();
    }
}


