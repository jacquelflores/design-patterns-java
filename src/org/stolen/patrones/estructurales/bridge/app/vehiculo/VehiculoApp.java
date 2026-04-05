package org.stolen.patrones.estructurales.bridge.app.vehiculo;

import org.stolen.patrones.estructurales.bridge.brifge_v2.Vehiculo;
import org.stolen.patrones.estructurales.bridge.model.vehiculo.tipo.Auto;
import org.stolen.patrones.estructurales.bridge.model.vehiculo.tipo.Moto;
import org.stolen.patrones.estructurales.bridge.model.vehiculo.util.Eléctrico;
import org.stolen.patrones.estructurales.bridge.model.vehiculo.util.Gasolina;

public class VehiculoApp {
    public static void main(String[] args) {
        Vehiculo v1 = new Moto(new Eléctrico());
        v1.tipoVehiculo();

        Vehiculo vehiculo2 = new Auto(new Gasolina());
        vehiculo2.tipoVehiculo();
    }
}
