package org.stolen.patrones.comportamiento.iterator_v0.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {
    private List<String> datos = new ArrayList<>();

    public void agregar(String s) {
        datos.add(s);
    }

   public Iterator<String> getIterator() {
        return datos.iterator(); // 🔥 devuelve iterator
    }
}
