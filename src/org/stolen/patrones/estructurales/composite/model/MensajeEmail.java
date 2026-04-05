package org.stolen.patrones.estructurales.composite.model;

import org.stolen.patrones.estructurales.composite.interfaces.Mensaje;

public class MensajeEmail implements Mensaje {

    @Override
    public void enviar() {
        System.out.println("Enviar un mensaje por Email");
    }
}
