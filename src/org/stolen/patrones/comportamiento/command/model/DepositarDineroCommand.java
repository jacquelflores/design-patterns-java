package org.stolen.patrones.comportamiento.command.model;

import org.stolen.patrones.comportamiento.command.interfaces.Accion;
import org.stolen.patrones.comportamiento.command.interfaces.CuentaBancariaInterface;

public class DepositarDineroCommand implements Accion {

    private CuentaBancariaInterface cuentaBancariaInterface;
    private double monto;

    public DepositarDineroCommand(CuentaBancariaInterface cuentaBancariaInterface, double monto) {
        this.cuentaBancariaInterface = cuentaBancariaInterface;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuentaBancariaInterface.depositar(monto);
    }
}
