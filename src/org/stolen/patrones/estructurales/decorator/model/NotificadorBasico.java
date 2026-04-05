package org.stolen.patrones.estructurales.decorator.model;


import org.stolen.patrones.estructurales.decorator.interfaces.Notificacion;

public class NotificadorBasico implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando un mensaje : " + mensaje);
    }
}
