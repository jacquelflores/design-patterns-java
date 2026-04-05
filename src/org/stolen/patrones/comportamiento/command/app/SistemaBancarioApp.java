package org.stolen.patrones.comportamiento.command.app;

import org.stolen.patrones.comportamiento.command.interfaces.Accion;
import org.stolen.patrones.comportamiento.command.interfaces.CuentaBancariaInterface;
import org.stolen.patrones.comportamiento.command.model.CajeroInvoker;
import org.stolen.patrones.comportamiento.command.model.DepositarDineroCommand;
import org.stolen.patrones.comportamiento.command.model.RetirarDineroCommand;
import org.stolen.patrones.comportamiento.command.model.proxy.CuentaBancariaProxy;

public class SistemaBancarioApp {
    public static void main(String[] args) {

        CuentaBancariaInterface cuenta = new CuentaBancariaProxy(true);
        Accion accion = new RetirarDineroCommand(cuenta,50);

        CajeroInvoker cajero = new CajeroInvoker();
        cajero.setAccion(accion); // retirar
        cajero.seleccionar();

        System.out.println("--------------------------------------------");

        Accion accion1 = new DepositarDineroCommand(cuenta, 100);

        cajero.setAccion(accion1); // depositar
        cajero.seleccionar();
    }
}
