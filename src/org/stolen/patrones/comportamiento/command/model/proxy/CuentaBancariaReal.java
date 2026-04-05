package org.stolen.patrones.comportamiento.command.model.proxy;

import org.stolen.patrones.comportamiento.command.interfaces.CuentaBancariaInterface;

public class CuentaBancariaReal implements CuentaBancariaInterface {
    private double saldo = 1000;
    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositado : " + monto);
        System.out.println("Saldo : " + saldo);
    }

    @Override
    public void retirar(double monto) {
        saldo -= monto;
        System.out.println("Monto retirado : " + monto);
        System.out.println("Saldo : " + saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo actual : " + saldo);
    }
}
