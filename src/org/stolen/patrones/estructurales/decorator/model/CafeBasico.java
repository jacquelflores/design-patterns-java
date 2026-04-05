package org.stolen.patrones.estructurales.decorator.model;


import org.stolen.patrones.estructurales.decorator.interfaces.Contenido;

public class CafeBasico implements Contenido {
    @Override
    public String descripcion() {
        return "Cafe Simple : " + "\n";
    }

    @Override
    public double costo() {
        return 5.0;
    }
}
