package org.stolen.patrones.comportamiento.state.app;

import org.stolen.patrones.comportamiento.state.model.Enviado;
import org.stolen.patrones.comportamiento.state.model.Pedido;
import org.stolen.patrones.comportamiento.state.model.Pendiente;

public class AppState {
    public static void main(String[] args) {

        Pedido p = new Pedido();
        p.setEstado(new Pendiente());
        p.procesar();

        p.setEstado(new Enviado());
        p.procesar();

    }
}
