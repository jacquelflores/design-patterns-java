package org.stolen.patrones.estructurales.bridge.model.store;

import org.stolen.patrones.estructurales.bridge.brifge_v2.Prenda;
import org.stolen.patrones.estructurales.bridge.interfaces.Talla;

public class Polo extends Prenda {

    public Polo(Talla talla) {
        super(talla);
    }

    @Override
    public void decision() {
        System.out.println("Polo");
        talla.mostrarTalla();
    }
}
