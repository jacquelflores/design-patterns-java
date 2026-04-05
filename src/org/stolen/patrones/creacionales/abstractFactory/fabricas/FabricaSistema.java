package org.stolen.patrones.creacionales.abstractFactory.fabricas;

import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarBotones;
import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarChecbox;

public interface FabricaSistema {
    EjecutarChecbox ejecutarChecbox();
    EjecutarBotones ejecutarBotones();
}
