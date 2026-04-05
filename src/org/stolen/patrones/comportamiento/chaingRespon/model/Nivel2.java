package org.stolen.patrones.comportamiento.chaingRespon.model;

public class Nivel2 extends Soporte {
    public void atender(String problema) {
        if (problema.equals("simple")) {
            System.out.println("Nivel 2 resolvió");
        } else if (siguiente != null) {
            siguiente.atender(problema); // 🔥 pasa al siguiente
        }
    }
}
