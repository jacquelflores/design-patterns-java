package org.stolen.patrones.estructurales.facade.factory;


import org.stolen.patrones.estructurales.facade.api.Auto;
import org.stolen.patrones.estructurales.facade.api.Bicicleta;
import org.stolen.patrones.estructurales.facade.api.Camioneta;
import org.stolen.patrones.estructurales.facade.api.Moto;
import org.stolen.patrones.estructurales.facade.enums.TipoVehiculo;
import org.stolen.patrones.estructurales.facade.fabrica.FamilyAbstractTransporte;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficioPrivado;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;

public class TransporteFabricaUrbanoFactory implements FamilyAbstractTransporte {


    @Override
    public BeneficiosUrbano beneficiosUrbano(TipoVehiculo tipoVehiculo) {
        if (tipoVehiculo == null) {
            throw new IllegalArgumentException("ESTE TIPO DE VEHICULO ES NULL");
        }
        return switch (tipoVehiculo) {
            case AUTO -> new Auto();
            case CAMIONETA -> new Camioneta();
            case BICICLETA -> new Bicicleta();
            case MOTO -> new Moto();
        };
    }

    @Override
    public BeneficioPrivado beneficioPrivado(TipoVehiculo t) {
        throw new UnsupportedOperationException("No hay BeneficioPrivado en esta fábrica");
    }
}
