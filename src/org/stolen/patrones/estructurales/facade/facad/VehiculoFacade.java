package org.stolen.patrones.estructurales.facade.facad;


import org.stolen.patrones.estructurales.facade.api.ContadorVehiculos;
import org.stolen.patrones.estructurales.facade.api.Vehiculos;
import org.stolen.patrones.estructurales.facade.factory.TransporteFabricaPrivadoFactory;
import org.stolen.patrones.estructurales.facade.factory.TransporteFabricaUrbanoFactory;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficioPrivado;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;
import org.stolen.patrones.estructurales.facade.repository.VehiculoRepositorio;

public class VehiculoFacade {
    private final VehiculoRepositorio vehiculoRepositorio;
    private final TransporteFabricaPrivadoFactory transporteFabricaPrivadoFactory;
    private final TransporteFabricaUrbanoFactory transporteFabricaUrbanoFactory;
    private final ContadorVehiculos contadorVehiculos;

    public VehiculoFacade(VehiculoRepositorio vehiculoRepositorio, TransporteFabricaPrivadoFactory
                                  transporteFabricaPrivadoFactory, TransporteFabricaUrbanoFactory
                                  transporteFabricaUrbanoFactory,
                          ContadorVehiculos contadorVehiculos) {
        this.vehiculoRepositorio = vehiculoRepositorio;
        this.transporteFabricaPrivadoFactory = transporteFabricaPrivadoFactory;
        this.transporteFabricaUrbanoFactory = transporteFabricaUrbanoFactory;
        this.contadorVehiculos = contadorVehiculos;
    }

    public void comportamientoTransporte(Vehiculos vehiculos) {
        if (vehiculos == null) {
            throw new IllegalArgumentException("Vehiculo no puede ser null");
        }

        try {
            BeneficioPrivado bp = transporteFabricaPrivadoFactory.beneficioPrivado(vehiculos.getTipo());
            bp.descuento();
        } catch (UnsupportedOperationException e) {
            System.out.println("Este vehículo no tiene beneficio privado");
        }

        if (vehiculos.getTipo() == null) {
            throw new IllegalArgumentException("No existe el tipo de Vehiculo");
        }

        BeneficiosUrbano bu = transporteFabricaUrbanoFactory.beneficiosUrbano(vehiculos.getTipo());
        bu.permisos();

        System.out.println("Vehiculo -> " + vehiculos.getModelo() + " -> " +
                vehiculos.getTipo() + " -> " + vehiculos.getPlaca() + " -> " +
                vehiculos.getColor() + " -> " + vehiculos.getAnio());

        vehiculoRepositorio.agregarVehiculos(vehiculos);
        contadorVehiculos.agregar();
        System.out.println("Total registrados: " + contadorVehiculos.getTotal());
    }

    public void listarVehiculos() {
        var lista = vehiculoRepositorio.listaVehiculos();
        for (int i = 0; i < lista.size(); i++) {
            Vehiculos v = lista.get(i);
            System.out.println("Vehiculo -> " + v.getModelo() + " -> " +
                    v.getTipo() + " -> " + v.getPlaca() + " -> " +
                    v.getColor() + " -> " + v.getAnio());
        }
    }


}
