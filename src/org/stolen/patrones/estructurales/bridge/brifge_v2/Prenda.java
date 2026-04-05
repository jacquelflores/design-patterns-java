package org.stolen.patrones.estructurales.bridge.brifge_v2;

import org.stolen.patrones.estructurales.bridge.interfaces.Talla;

public abstract class Prenda  {
    protected Talla talla;

    public Prenda(Talla talla) {
        this.talla = talla;
    }

    public abstract void decision();
}
