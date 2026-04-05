package org.stolen.patrones.estructurales.facade.api;


import org.stolen.patrones.estructurales.facade.interfaces.BeneficioPrivado;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;

public class Camioneta implements BeneficiosUrbano, BeneficioPrivado {
    @Override
    public void descuento() {
        System.out.println("CAMIONETA CON DESCUENTO EN SU PROXIMA COMPRA EN PLAZA VEA");
    }

    @Override
    public void permisos() {
        System.out.println("CAMIONETA CON PERMISO DE SALIDA....");
    }
}
