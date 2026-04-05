package org.stolen.patrones.estructurales.bridge.app;

import org.stolen.patrones.estructurales.bridge.brifge_v2.Prenda;
import org.stolen.patrones.estructurales.bridge.model.store.Polo;
import org.stolen.patrones.estructurales.bridge.model.store.TallaS;

public class TiendaApp {
    public static void main(String[] args) {
        Prenda p1 = new Polo(new TallaS());
        p1.decision();

    }
}
