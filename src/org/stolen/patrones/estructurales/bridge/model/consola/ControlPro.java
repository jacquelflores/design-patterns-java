package org.stolen.patrones.estructurales.bridge.model.consola;

import org.stolen.patrones.estructurales.bridge.brifge_v2.TipoControl;
import org.stolen.patrones.estructurales.bridge.interfaces.TipoConsola;

public class ControlPro extends TipoControl {
    public ControlPro(TipoConsola tipoConsola) {
        super(tipoConsola);
    }

    @Override
    public void tipoControl() {
        System.out.println("CONTROL PRO:");
        tipoConsola.tipoConsola();
    }
}
