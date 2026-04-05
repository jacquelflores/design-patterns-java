package org.stolen.patrones.comportamiento.templateMethod.model;

public abstract class Bebida {
    // 🔥método template (define el flujo)
    public final void preparar() {
        hervirAgua();
        agregarIngrediente(); // 🔴 cambia
        servir();
    }

    void hervirAgua() {
        System.out.println("Hirviendo agua");
    }

    abstract void agregarIngrediente(); // 🔴 lo define la subclase

    void servir() {
        System.out.println("Sirviendo bebida");
    }
}
