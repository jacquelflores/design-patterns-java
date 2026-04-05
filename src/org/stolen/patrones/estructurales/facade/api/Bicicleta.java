package org.stolen.patrones.estructurales.facade.api;

import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;

public class Bicicleta implements BeneficiosUrbano {

    @Override
    public void permisos() {
        System.out.println("LA BICICLETA TIENE PERMISO DE SALIDA...");
    }
}
