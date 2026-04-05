package org.stolen.patrones.comportamiento.mediator.model;

public class CheckEmpresa {
    private Formulario f;

    public CheckEmpresa(Formulario f) {
        this.f = f;
    }

   public void seleccionar() {
        f.cambiar("empresa"); // 🔥 usa mediator
    }
}
