package org.stolen.patrones.comportamiento.chaingRespon.app;

import org.stolen.patrones.comportamiento.chaingRespon.model.Nivel1;
import org.stolen.patrones.comportamiento.chaingRespon.model.Nivel2;
import org.stolen.patrones.comportamiento.chaingRespon.model.Nivel3;
import org.stolen.patrones.comportamiento.chaingRespon.model.Soporte;

public class AppChaing {
    public static void main(String[] args) {

        Soporte n1 = new Nivel1();
        Soporte n2 = new Nivel2();
        Soporte n3 = new Nivel3();

        n1.setSiguiente(n2);
        n2.setSiguiente(n3);

        n1.atender("medio");
    }
}
