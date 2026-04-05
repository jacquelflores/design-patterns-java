package org.stolen.patrones.estructurales.facade.factory;

import org.stolen.patrones.estructurales.facade.api.Auto;
import org.stolen.patrones.estructurales.facade.api.Camioneta;
import org.stolen.patrones.estructurales.facade.enums.TipoVehiculo;
import org.stolen.patrones.estructurales.facade.fabrica.FamilyAbstractTransporte;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficioPrivado;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;


public class TransporteFabricaPrivadoFactory implements FamilyAbstractTransporte {


    @Override
    public BeneficiosUrbano beneficiosUrbano(TipoVehiculo tipoVehiculo) {
        throw new UnsupportedOperationException("No hay BeneficioPrivado en esta fábrica");
    }

    @Override
    public BeneficioPrivado beneficioPrivado(TipoVehiculo t) {
        if (t == null) {
            throw new IllegalArgumentException("ESTE TIPO DE VEHICULO NO PUEDE SER NULL");
        }
        return switch (t) {
            case AUTO -> new Auto();
            case CAMIONETA -> new Camioneta();
            default -> throw new IllegalArgumentException("Este tipo de vehículo no tiene BeneficioPrivado");
        };
    }
}
