package org.stolen.patrones.estructurales.adapter.app.pago;

import org.stolen.patrones.estructurales.adapter.interfacess.pago.Pago;
import org.stolen.patrones.estructurales.adapter.model.pago.TarjetaCredito;
import org.stolen.patrones.estructurales.adapter.model.pago.TarjetaCreditoAdapter;

public class PagoApp {
    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito();
        Pago pago = new TarjetaCreditoAdapter(tarjeta);

        pago.pagar();
    }
}
