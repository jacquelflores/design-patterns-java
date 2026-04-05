package org.stolen.patrones.comportamiento.command.interfaces;

public interface CuentaBancariaInterface {
    void depositar(double monto);
    void retirar(double monto);
    void consultarSaldo();
}
