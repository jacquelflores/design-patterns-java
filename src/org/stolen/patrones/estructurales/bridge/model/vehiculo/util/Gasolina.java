package org.stolen.patrones.estructurales.bridge.model.vehiculo.util;

import org.stolen.patrones.estructurales.bridge.interfaces.Motor;

public class Gasolina implements Motor {
    @Override
    public void utilidad() {
        System.out.println("Motor a gasolina...");
    }
}
