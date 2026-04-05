package org.stolen.patrones.estructurales.proxy.impl.cuenta;

import org.stolen.patrones.estructurales.proxy.model.Cuenta;

public interface ICuenta {
    Cuenta retirarDinero(Cuenta cuenta, double monto);
    Cuenta depositarDinero(Cuenta cuenta, double monto);
    void mostrarSaldo(Cuenta cuenta);
}
