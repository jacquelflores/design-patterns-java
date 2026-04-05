package org.stolen.patrones.estructurales.bridge.model.consola;

import org.stolen.patrones.estructurales.bridge.brifge_v2.TipoControl;
import org.stolen.patrones.estructurales.bridge.interfaces.TipoConsola;

public class ControlBasico extends TipoControl {
    public ControlBasico(TipoConsola tipoConsola) {
        super(tipoConsola);
    }

    @Override
    public void tipoControl() {
        System.out.println("CONTROL BASICO:");
        tipoConsola.tipoConsola();
    }
}
