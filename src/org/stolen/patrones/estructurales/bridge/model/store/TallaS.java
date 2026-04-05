package org.stolen.patrones.estructurales.bridge.model.store;

import org.stolen.patrones.estructurales.bridge.interfaces.Talla;

public class TallaS implements Talla {
    @Override
    public void mostrarTalla() {
        System.out.println("Talla S");
    }
}
