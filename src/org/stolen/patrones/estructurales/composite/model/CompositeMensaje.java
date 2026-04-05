package org.stolen.patrones.estructurales.composite.model;

import org.stolen.patrones.estructurales.composite.interfaces.Mensaje;

import java.util.ArrayList;
import java.util.List;

public class CompositeMensaje implements Mensaje {

    private List<Mensaje> list = new ArrayList<>();

    public void agregar(Mensaje m) {
        list.add(m);
    }

    @Override
    public void enviar() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).enviar();
        }
    }
}
