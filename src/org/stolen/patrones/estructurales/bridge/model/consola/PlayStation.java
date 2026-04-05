package org.stolen.patrones.estructurales.bridge.model.consola;

import org.stolen.patrones.estructurales.bridge.interfaces.TipoConsola;

public class PlayStation implements TipoConsola {
    @Override
    public void tipoConsola() {
        System.out.println("Play Station");
    }
}
