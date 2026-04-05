package org.stolen.patrones.creacionales.abstractFactory.model;

import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarBotones;

public class WindowsBotones implements EjecutarBotones {
    @Override
    public void aceptarBoton() {
        System.out.println("Botón aceptar para Window.");
    }
}
