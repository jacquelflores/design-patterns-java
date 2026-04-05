package org.stolen.patrones.comportamiento.chaingRespon.model;

public abstract class Soporte {
    protected Soporte siguiente;

    public void setSiguiente(Soporte s) {
        this.siguiente = s;
    }

    public abstract void atender(String problema);
}
