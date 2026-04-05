package org.stolen.patrones.comportamiento.command.model;

import org.stolen.patrones.comportamiento.command.interfaces.Accion;
import org.stolen.patrones.comportamiento.command.interfaces.CuentaBancariaInterface;

public class ConsultarSaldoCommand implements Accion {
    private CuentaBancariaInterface cuentaBancariaReceptor;

    public ConsultarSaldoCommand(CuentaBancariaInterface cuentaBancariaReceptor) {
        this.cuentaBancariaReceptor = cuentaBancariaReceptor;
    }

    @Override
    public void ejecutar() {
            cuentaBancariaReceptor.consultarSaldo();
    }
}
