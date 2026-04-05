package org.stolen.patrones.estructurales.bridge.model.vehiculo.util;

import org.stolen.patrones.estructurales.bridge.interfaces.Motor;

public class Eléctrico implements Motor {
    @Override
    public void utilidad() {
        System.out.println("Motor a electrico..");
    }
}
