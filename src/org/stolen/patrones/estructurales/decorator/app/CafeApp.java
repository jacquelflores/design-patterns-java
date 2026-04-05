package org.stolen.patrones.estructurales.decorator.app;

import org.stolen.patrones.estructurales.decorator.decoracion.cafe.CafeConAzucar;
import org.stolen.patrones.estructurales.decorator.decoracion.cafe.CafeConChocolate;
import org.stolen.patrones.estructurales.decorator.decoracion.cafe.CafeConLeche;
import org.stolen.patrones.estructurales.decorator.interfaces.Contenido;
import org.stolen.patrones.estructurales.decorator.model.CafeBasico;

public class CafeApp {
    public static void main(String[] args) {
       Contenido contenido = new CafeBasico();
       contenido = new CafeConAzucar(contenido);
       contenido = new CafeConChocolate(contenido);
       contenido = new CafeConLeche(contenido);

        System.out.println(contenido.descripcion());
        System.out.println(contenido.costo());
    }
}
