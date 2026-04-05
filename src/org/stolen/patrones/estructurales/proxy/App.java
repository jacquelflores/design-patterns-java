package org.stolen.patrones.estructurales.proxy;

import org.stolen.patrones.estructurales.proxy.impl.cuenta.CuentaBancoBImpl;
import org.stolen.patrones.estructurales.proxy.impl.cuenta.ICuenta;
import org.stolen.patrones.estructurales.proxy.model.Cuenta;
import org.stolen.patrones.estructurales.proxy.proxy.cuenta.CuentaProxy;

public class App {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "mitocode", 100);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);

    }
}
