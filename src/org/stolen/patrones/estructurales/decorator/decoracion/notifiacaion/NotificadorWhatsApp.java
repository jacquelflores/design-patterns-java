package org.stolen.patrones.estructurales.decorator.decoracion.notifiacaion;


import org.stolen.patrones.estructurales.decorator.decoracion.notifiacaion.decorador.NotificadorDecorator;
import org.stolen.patrones.estructurales.decorator.interfaces.Notificacion;

public class NotificadorWhatsApp extends NotificadorDecorator {

    public NotificadorWhatsApp(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando copia por WhatsApp...");
    }
}
