package org.stolen.patrones.comportamiento.state.model;

import org.stolen.patrones.comportamiento.state.interfaces.Estado;

public class Enviado implements Estado {
    @Override
    public void manejar() {
        System.out.println("Pedido enviado.");
    }
}
