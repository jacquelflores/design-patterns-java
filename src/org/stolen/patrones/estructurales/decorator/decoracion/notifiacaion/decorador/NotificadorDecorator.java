package org.stolen.patrones.estructurales.decorator.decoracion.notifiacaion.decorador;


import org.stolen.patrones.estructurales.decorator.interfaces.Notificacion;

public abstract class NotificadorDecorator implements Notificacion {

    protected Notificacion notificacion;

    public NotificadorDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}
