package org.stolen.patrones.comportamiento.command.model;

import org.stolen.patrones.comportamiento.command.interfaces.Accion;

public class CajeroInvoker {

    private Accion accion;

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    public void seleccionar() {
        accion.ejecutar();
    }
}
