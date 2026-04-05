package org.stolen.patrones.estructurales.adapter.model.notificaciones;

import org.stolen.patrones.estructurales.adapter.interfacess.notifi.Envios;

public class SMSAdapter implements Envios {

    private SMS sms;

    public SMSAdapter(SMS sms) {
        this.sms = sms;
    }

    @Override
    public void sendMensaje() {
        sms.sendSMS();
    }
}
