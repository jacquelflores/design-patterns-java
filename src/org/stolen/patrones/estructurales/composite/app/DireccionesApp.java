package org.stolen.patrones.estructurales.composite.app;

import org.stolen.patrones.estructurales.composite.interfaces.Mensaje;
import org.stolen.patrones.estructurales.composite.model.CompositeMensaje;
import org.stolen.patrones.estructurales.composite.model.MensajeEmail;
import org.stolen.patrones.estructurales.composite.model.MensajePush;

public class DireccionesApp {
    public static void main(String[] args) {
        Mensaje mensaje = new MensajePush();
        Mensaje email = new MensajeEmail();
        CompositeMensaje compositeMensaje = new CompositeMensaje();
        compositeMensaje.agregar(mensaje);
        compositeMensaje.agregar(email);
        compositeMensaje.enviar();

    }
}
