package org.stolen.patrones.estructurales.adapter.app.notifi;

import org.stolen.patrones.estructurales.adapter.interfacess.notifi.Envios;
import org.stolen.patrones.estructurales.adapter.model.notificaciones.Email;
import org.stolen.patrones.estructurales.adapter.model.notificaciones.EmailAdapter;
import org.stolen.patrones.estructurales.adapter.model.notificaciones.SMS;
import org.stolen.patrones.estructurales.adapter.model.notificaciones.SMSAdapter;

public class NotificacionApp {
    public static void main(String[] args) {

        Email email = new Email();
        SMS sms = new SMS();
        Envios envios = new EmailAdapter(email);
        envios.sendMensaje();

        Envios envios1 = new SMSAdapter(sms);
        envios1.sendMensaje();

    }
}
