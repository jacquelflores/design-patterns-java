package org.stolen.patrones.estructurales.bridge.model.reportes;

import org.stolen.patrones.estructurales.bridge.interfaces.Exportador;

public class PDF implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("PDF:" + contenido);
    }
}
