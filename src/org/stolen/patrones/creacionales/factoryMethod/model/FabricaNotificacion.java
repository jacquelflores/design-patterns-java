package org.stolen.patrones.creacionales.factoryMethod.model;

import org.stolen.patrones.creacionales.factoryMethod.enums.Canales;
import org.stolen.patrones.creacionales.factoryMethod.interfaces.INotificacion;

public class FabricaNotificacion {

    public INotificacion crearNotificacion(Canales tipo) {
        return switch (tipo) {
            case EMAIL -> new Email();
            case PUSH -> new Push();
            case SMS-> new Sms();
            default -> throw new IllegalStateException("Tipo de notificación no válido " + tipo);
        };
    }

}
