package org.stolen.patrones.creacionales.abstractFactory.model;

import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarChecbox;

public class MacCheckbox implements EjecutarChecbox {
    @Override
    public void seleeccionar() {
        System.out.println("Seleccionando el checkbox para Mac.");
    }
}
