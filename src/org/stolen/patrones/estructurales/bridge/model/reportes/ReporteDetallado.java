package org.stolen.patrones.estructurales.bridge.model.reportes;

import org.stolen.patrones.estructurales.bridge.brifge_v2.ReporteAbst;
import org.stolen.patrones.estructurales.bridge.interfaces.Exportador;

public class ReporteDetallado extends ReporteAbst {

    public ReporteDetallado(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void tipoReporte() {
        exportador.exportar("Reporte Detallado");
    }
}
