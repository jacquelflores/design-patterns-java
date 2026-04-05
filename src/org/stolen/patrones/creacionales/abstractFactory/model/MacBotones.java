package org.stolen.patrones.creacionales.abstractFactory.model;

import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarBotones;

public class MacBotones implements EjecutarBotones {
    @Override
    public void aceptarBoton() {
        System.out.println("Boton aceptar para Mac.");
    }
}
