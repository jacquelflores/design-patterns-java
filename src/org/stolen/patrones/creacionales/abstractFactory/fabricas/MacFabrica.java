package org.stolen.patrones.creacionales.abstractFactory.fabricas;

import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarBotones;
import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarChecbox;
import org.stolen.patrones.creacionales.abstractFactory.model.MacBotones;
import org.stolen.patrones.creacionales.abstractFactory.model.MacCheckbox;

public class MacFabrica implements FabricaSistema{
    @Override
    public EjecutarChecbox ejecutarChecbox() {
        return new MacCheckbox();
    }

    @Override
    public EjecutarBotones ejecutarBotones() {
        return new MacBotones();
    }
}
