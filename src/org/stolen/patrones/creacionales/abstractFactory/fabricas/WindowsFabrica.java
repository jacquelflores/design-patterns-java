package org.stolen.patrones.creacionales.abstractFactory.fabricas;

import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarBotones;
import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarChecbox;
import org.stolen.patrones.creacionales.abstractFactory.model.WindowsBotones;
import org.stolen.patrones.creacionales.abstractFactory.model.WindowsCheckbox;

public class WindowsFabrica implements FabricaSistema{
    @Override
    public EjecutarChecbox ejecutarChecbox() {
        return new WindowsCheckbox();
    }

    @Override
    public EjecutarBotones ejecutarBotones() {
        return new WindowsBotones();
    }
}
