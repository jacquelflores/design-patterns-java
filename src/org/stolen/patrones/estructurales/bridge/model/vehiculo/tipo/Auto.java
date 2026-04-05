package org.stolen.patrones.estructurales.bridge.model.vehiculo.tipo;

import org.stolen.patrones.estructurales.bridge.brifge_v2.Vehiculo;
import org.stolen.patrones.estructurales.bridge.interfaces.Motor;

public class Auto extends Vehiculo {

    public Auto(Motor motor) {
        super(motor);
    }

    @Override
    public void tipoVehiculo() {
        System.out.println("Auto:");
        motor.utilidad();
    }
}
