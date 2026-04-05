package org.stolen.patrones.estructurales.bridge.brifge_v2;

import org.stolen.patrones.estructurales.bridge.interfaces.Exportador;

public abstract class ReporteAbst {

    protected  Exportador exportador;

    public ReporteAbst(Exportador exportador) {
        this.exportador = exportador;
    }

    public abstract void tipoReporte();

}
