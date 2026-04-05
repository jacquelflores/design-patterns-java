package org.stolen.patrones.estructurales.adapter.model.notificaciones;

import org.stolen.patrones.estructurales.adapter.interfacess.notifi.Envios;

public class EmailAdapter implements Envios {

    private Email email;

    public EmailAdapter(Email email) {
        this.email = email;
    }

    @Override
    public void sendMensaje() {
        email.sendEmail();
    }
}
