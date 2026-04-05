package org.stolen.patrones.estructurales.decorator.app;

import org.stolen.patrones.estructurales.decorator.decoracion.notifiacaion.NotificadorConLog;
import org.stolen.patrones.estructurales.decorator.decoracion.notifiacaion.NotificadorWhatsApp;
import org.stolen.patrones.estructurales.decorator.interfaces.Notificacion;
import org.stolen.patrones.estructurales.decorator.model.NotificadorBasico;

public class NotificacionApp {
    public static void main(String[] args) {
        Notificacion notificador = new NotificadorWhatsApp(new NotificadorConLog(new NotificadorBasico()));

        notificador.enviar("Hola Jacqueline");


    }
}
