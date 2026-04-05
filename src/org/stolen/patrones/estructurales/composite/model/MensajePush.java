package org.stolen.patrones.estructurales.composite.model;

import org.stolen.patrones.estructurales.composite.interfaces.Mensaje;

public class MensajePush implements Mensaje {

    @Override
    public void enviar() {
        System.out.println("Enviar un mensaje por Push");
    }
}
