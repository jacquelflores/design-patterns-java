package org.stolen.patrones.comportamiento.mediator.model;

public class CheckPersona {
    private Formulario f;

    public CheckPersona(Formulario f) {
        this.f = f;
    }

   public void seleccionar() {
        f.cambiar("persona"); // 🔥 usa mediator
    }
}
