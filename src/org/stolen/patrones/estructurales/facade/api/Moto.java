package org.stolen.patrones.estructurales.facade.api;


import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;

public class Moto implements BeneficiosUrbano {

    @Override
    public void permisos() {
        System.out.println("LA MOTO TIENE PERMISO DE SALIDA...");
    }
}
