package org.stolen.patrones.estructurales.facade.app;


import org.stolen.patrones.estructurales.facade.api.ContadorVehiculos;
import org.stolen.patrones.estructurales.facade.api.Vehiculos;
import org.stolen.patrones.estructurales.facade.enums.TipoVehiculo;
import org.stolen.patrones.estructurales.facade.facad.VehiculoFacade;
import org.stolen.patrones.estructurales.facade.factory.TransporteFabricaPrivadoFactory;
import org.stolen.patrones.estructurales.facade.factory.TransporteFabricaUrbanoFactory;
import org.stolen.patrones.estructurales.facade.repository.VehiculoRepositorio;

import java.time.LocalDateTime;

public class AppTransporte {
    public static void main(String[] args) {

        VehiculoRepositorio vehiculoRepositorio = new VehiculoRepositorio();
        TransporteFabricaPrivadoFactory transporteFabricaPrivadoFactory = new TransporteFabricaPrivadoFactory();
        TransporteFabricaUrbanoFactory transporteFabricaUrbanoFactory = new TransporteFabricaUrbanoFactory();
        ContadorVehiculos contadorVehiculos = ContadorVehiculos.getInstance();

        VehiculoFacade vehiculoFacade = new VehiculoFacade(vehiculoRepositorio,
                transporteFabricaPrivadoFactory, transporteFabricaUrbanoFactory,
                contadorVehiculos);

        Vehiculos vehiculos = Vehiculos.builder()
                .modelo("LM")
                .tipo(TipoVehiculo.AUTO)
                .placa("Z615DDF")
                .color("Rojo")
                .anio(LocalDateTime.now())
                .build();

        Vehiculos vehiculos1 = Vehiculos.builder()
                .modelo("Subaru")
                .tipo(TipoVehiculo.CAMIONETA)
                .placa("Z615DDS")
                .color("Negro")
                .anio(LocalDateTime.now())
                .build();

        vehiculoFacade.comportamientoTransporte(vehiculos);
        vehiculoFacade.comportamientoTransporte(vehiculos1);
        System.out.println("=== VEHICULOS REGISTRADOS ===");
        vehiculoFacade.listarVehiculos();

    }
}
