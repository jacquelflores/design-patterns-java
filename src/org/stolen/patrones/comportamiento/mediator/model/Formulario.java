package org.stolen.patrones.comportamiento.mediator.model;

public class Formulario {
    void cambiar(String campo) {
        if (campo.equals("empresa")) {
            System.out.println("Activar campo RUC");
        } else if (campo.equals("persona")) {
            System.out.println("Desactivar campo RUC");
        }
    }
}
