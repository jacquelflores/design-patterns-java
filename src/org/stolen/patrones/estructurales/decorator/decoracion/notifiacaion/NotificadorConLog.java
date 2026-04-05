package org.stolen.patrones.estructurales.decorator.decoracion.notifiacaion;

import org.stolen.patrones.estructurales.decorator.decoracion.notifiacaion.decorador.NotificadorDecorator;
import org.stolen.patrones.estructurales.decorator.interfaces.Notificacion;

public class NotificadorConLog extends NotificadorDecorator {

    public NotificadorConLog(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Guardando en log....");
    }
}
