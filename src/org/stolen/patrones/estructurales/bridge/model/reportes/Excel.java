package org.stolen.patrones.estructurales.bridge.model.reportes;

import org.stolen.patrones.estructurales.bridge.interfaces.Exportador;

public class Excel implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("EXCEL: " + contenido);
    }
}
