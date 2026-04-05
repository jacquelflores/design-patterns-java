package org.stolen.patrones.comportamiento.iterator_v0.app;

import org.stolen.patrones.comportamiento.iterator_v0.model.Lista;

import java.util.Iterator;

public class AppIterator {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregar("A");
        lista.agregar("B");
        lista.agregar("C");

        Iterator<String> it = lista.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next()); // 🔥 recorrer
        }
    }
}
