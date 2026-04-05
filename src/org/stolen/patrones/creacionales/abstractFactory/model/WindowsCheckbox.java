package org.stolen.patrones.creacionales.abstractFactory.model;

import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarChecbox;

public class WindowsCheckbox implements EjecutarChecbox {
    @Override
    public void seleeccionar() {
        System.out.println("Seleccionado el checbox para Window.");
    }
}
