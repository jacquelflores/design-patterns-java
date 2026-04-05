package org.stolen.patrones.estructurales.facade.fabrica;


import org.stolen.patrones.estructurales.facade.enums.TipoVehiculo;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficioPrivado;
import org.stolen.patrones.estructurales.facade.interfaces.BeneficiosUrbano;

public interface FamilyAbstractTransporte {
    BeneficiosUrbano beneficiosUrbano(TipoVehiculo tipoVehiculo);
    BeneficioPrivado beneficioPrivado(TipoVehiculo t);
}
