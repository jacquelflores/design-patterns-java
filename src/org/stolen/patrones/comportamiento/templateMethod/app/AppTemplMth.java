package org.stolen.patrones.comportamiento.templateMethod.app;

import org.stolen.patrones.comportamiento.templateMethod.model.Bebida;
import org.stolen.patrones.comportamiento.templateMethod.model.Cafe;
import org.stolen.patrones.comportamiento.templateMethod.model.Te;

public class AppTemplMth {
    public static void main(String[] args) {

        Bebida b = new Cafe();
        b.preparar();

        Bebida b2 = new Te();
        b2.preparar();
    }
}
