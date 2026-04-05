package org.stolen.patrones.creacionales.prototype;

import org.stolen.patrones.creacionales.prototype.model.Personaje;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> inventarioBase = new ArrayList<>();
        inventarioBase.add("Espada");

        List<String> habilidadesBase = new ArrayList<>();
        habilidadesBase.add("Golpe fuerte");

        Personaje original = new Personaje(100, 20, inventarioBase, habilidadesBase);

        Personaje clon1 = original.clonar();
        Personaje clon2 = original.clonar();

        clon1.setVida(50);
        clon1.getInventario().add("Poción");

        System.out.println("🧍 ORIGINAL:");
        original.mostrar();

        System.out.println("🧍 CLON 1:");
        clon1.mostrar();

        System.out.println("🧍 CLON 2:");
        clon2.mostrar();
    }
}
