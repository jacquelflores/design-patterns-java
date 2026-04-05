package org.stolen.patrones.estructurales.bridge.app.report;

import org.stolen.patrones.estructurales.bridge.brifge_v2.ReporteAbst;
import org.stolen.patrones.estructurales.bridge.model.reportes.Excel;
import org.stolen.patrones.estructurales.bridge.model.reportes.PDF;
import org.stolen.patrones.estructurales.bridge.model.reportes.ReporteDetallado;
import org.stolen.patrones.estructurales.bridge.model.reportes.ReporteSimple;

public class ReporteApp {
    public static void main(String[] args) {

        ReporteAbst reporteAbst = new ReporteDetallado(new Excel());
        reporteAbst.tipoReporte();

        ReporteAbst reporteAbst1 = new ReporteSimple(new PDF());
        reporteAbst1.tipoReporte();

    }
}
