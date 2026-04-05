package org.stolen.patrones.comportamiento.command.model;

import org.stolen.patrones.comportamiento.command.interfaces.Accion;
import org.stolen.patrones.comportamiento.command.interfaces.CuentaBancariaInterface;

public class RetirarDineroCommand implements Accion {

    private CuentaBancariaInterface cuentaBancariaInterface;

    private double monto;

    public RetirarDineroCommand(CuentaBancariaInterface cuentaBancariaInterface, double monto) {
        this.cuentaBancariaInterface = cuentaBancariaInterface;
        this.monto = monto;
    }
    @Override
    public void ejecutar() {
        cuentaBancariaInterface.retirar(monto);
    }
}
