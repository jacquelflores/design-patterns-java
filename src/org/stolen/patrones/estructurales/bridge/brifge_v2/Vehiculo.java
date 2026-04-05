package org.stolen.patrones.estructurales.bridge.brifge_v2;

import org.stolen.patrones.estructurales.bridge.interfaces.Motor;

public abstract class Vehiculo {
    protected Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    public abstract void tipoVehiculo();
}
