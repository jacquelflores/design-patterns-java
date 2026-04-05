package org.stolen.patrones.comportamiento.chaingRespon.model;

public class Nivel1 extends Soporte {
    public void atender(String problema) {
        if (problema.equals("simple")) {
            System.out.println("Nivel 1 resolvió");
        } else if (siguiente != null) {
            siguiente.atender(problema); // 🔥 pasa al siguiente
        }
    }
}
