package org.stolen.patrones.estructurales.facade.repository;


import org.stolen.patrones.estructurales.facade.api.Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class VehiculoRepositorio {
    List<Vehiculos> vehiculos = new ArrayList<>();

    public List<Vehiculos> listaVehiculos() {
        return new ArrayList<>(vehiculos);
    }

    public void agregarVehiculos(Vehiculos v) {
        if (v != null){
            vehiculos.add(v);
        }else {
            throw new IllegalArgumentException("No se puede agregar un vehiculo");
        }
    }
}
