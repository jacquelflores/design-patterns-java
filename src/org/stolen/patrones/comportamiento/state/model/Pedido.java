package org.stolen.patrones.comportamiento.state.model;

import org.stolen.patrones.comportamiento.state.interfaces.Estado;

public class Pedido {
    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void procesar() {
        estado.manejar(); //cambia de comportamiento.
    }
}
