package org.stolen.patrones.estructurales.bridge.app;

import org.stolen.patrones.estructurales.bridge.brifge_v2.TipoControl;
import org.stolen.patrones.estructurales.bridge.model.consola.ControlBasico;
import org.stolen.patrones.estructurales.bridge.model.consola.ControlPro;
import org.stolen.patrones.estructurales.bridge.model.consola.PlayStation;
import org.stolen.patrones.estructurales.bridge.model.consola.Xbox;

public class ControlVideojuegosApp {
    public static void main(String[] args) {


        TipoControl tipoControl = new ControlBasico(new Xbox());
        tipoControl.tipoControl();

        TipoControl controlPro = new ControlPro(new PlayStation());
        controlPro.tipoControl();
    }
}
