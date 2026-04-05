package org.stolen.patrones.creacionales.factoryMethod.app;

import org.stolen.patrones.creacionales.factoryMethod.Canales;
import org.stolen.patrones.creacionales.factoryMethod.interfaces.INotificacion;
import org.stolen.patrones.creacionales.factoryMethod.model.FabricaNotificacion;

public class SistemaNotificaciones {
    public static void main(String[] args) {

        FabricaNotificacion notificacion = new FabricaNotificacion();

        INotificacion iNotificacion = notificacion.crearNotificacion(Canales.PUSH);
        iNotificacion.mensaje();

    }
}
