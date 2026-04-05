package org.stolen.patrones.estructurales.facade.api;


import org.stolen.patrones.estructurales.facade.interfaces.BeneficioPrivado;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;

public class Auto implements BeneficioPrivado, BeneficiosUrbano {

    @Override
    public void descuento() {
        System.out.println("AUTO CON DESCUENTO DE 10% EN SU PROXIMA RECARGA DE GASOLIAN PREMIUM");
    }

    @Override
    public void permisos() {
        System.out.println("AUTO CON PERMISO DE SALIDA...");
    }
}
