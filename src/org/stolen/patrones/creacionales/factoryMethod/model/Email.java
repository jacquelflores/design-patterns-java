package org.stolen.patrones.creacionales.factoryMethod.model;

import org.stolen.patrones.creacionales.factoryMethod.interfaces.INotificacion;

public class Email implements INotificacion {

    @Override
    public void mensaje() {
        System.out.println("Enviando notificación por GMAIL...");
    }
}
