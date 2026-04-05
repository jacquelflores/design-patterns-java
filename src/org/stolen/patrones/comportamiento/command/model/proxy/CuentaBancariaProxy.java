package org.stolen.patrones.comportamiento.command.model.proxy;

import org.stolen.patrones.comportamiento.command.interfaces.CuentaBancariaInterface;

public class CuentaBancariaProxy implements CuentaBancariaInterface {

    private CuentaBancariaReal cuentaBancariaReal;
    private boolean acceso;

    public CuentaBancariaProxy(boolean acceso) {
        this.acceso = acceso;
    }

    @Override
    public void depositar(double monto) {
        if (acceso) {
            if (cuentaBancariaReal == null) {
                cuentaBancariaReal = new CuentaBancariaReal();
            }
            cuentaBancariaReal.depositar(monto);
        } else {
            System.out.println("Acceso denegado");
        }
    }

    @Override
    public void retirar(double monto) {
        if (acceso) {
            if (cuentaBancariaReal == null) {
                cuentaBancariaReal = new CuentaBancariaReal();
            }
            cuentaBancariaReal.retirar(monto);
        } else {
            System.out.println("Acceso denegado");
        }
    }

    @Override
    public void consultarSaldo() {
        if (acceso) {
            if (cuentaBancariaReal == null) {
                cuentaBancariaReal = new CuentaBancariaReal();
            }
            cuentaBancariaReal.consultarSaldo();
        } else {
            System.out.println("Acceso denegado");
        }
    }

}
