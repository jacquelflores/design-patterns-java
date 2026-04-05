package org.stolen.patrones.estructurales.adapter.model.pago;

import org.stolen.patrones.estructurales.adapter.interfacess.pago.Pago;

public class TarjetaCreditoAdapter implements Pago {

    private TarjetaCredito tarjetaCredito;

    public TarjetaCreditoAdapter(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    @Override
    public void pagar() {
        tarjetaCredito.realizarPago();
    }
}
