package org.stolen.patrones.estructurales.bridge.brifge_v2;

import org.stolen.patrones.estructurales.bridge.interfaces.TipoConsola;

public abstract class TipoControl {
    protected TipoConsola tipoConsola;

    public TipoControl(TipoConsola tipoConsola) {
        this.tipoConsola = tipoConsola;
    }

    public abstract void tipoControl();
}
