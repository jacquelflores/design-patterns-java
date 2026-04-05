package org.stolen.patrones.estructurales.facade.api;

public class ContadorVehiculos {

    private static ContadorVehiculos instance;
    private int total;

    private ContadorVehiculos() {
    }

    public static ContadorVehiculos getInstance() {
        if (instance == null) {
            instance = new ContadorVehiculos();
        }
        return instance;
    }

    public void agregar() {
        total++;
    }

    public int getTotal() {
        return total;
    }

}
