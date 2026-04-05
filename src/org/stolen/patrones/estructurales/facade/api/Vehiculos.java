package org.stolen.patrones.estructurales.facade.api;


import org.stolen.patrones.estructurales.facade.enums.TipoVehiculo;

import java.time.LocalDateTime;

public class Vehiculos {

    private final String color;
    private final String modelo;
    private final LocalDateTime anio;
    private final String placa;
    private final TipoVehiculo tipo;

    public Vehiculos(Builder builder) {
        this.color = builder.color;
        this.modelo = builder.modelo;
        this.anio = LocalDateTime.now();
        this.placa = builder.placa;
        this.tipo = builder.tipo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDateTime getAnio() {
        return anio;
    }

    public String getPlaca() {
        return placa;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculos : " +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + anio +
                ", placa='" + placa + '\'' +
                ", tipo=" + tipo;
    }

    //START

    public static class Builder {
        private String color;
        private String modelo;
        private LocalDateTime anio;
        private String placa;
        private TipoVehiculo tipo;

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder anio(LocalDateTime anio) {
            this.anio = anio;
            return this;
        }

        public Builder placa(String placa) {
            this.placa = placa;
            return this;
        }

        public Builder tipo(TipoVehiculo tipo) {
            this.tipo = tipo;
            return this;
        }

        public Vehiculos build() {
            return new Vehiculos(this);
        }
    }
    //END

    public static Builder builder() {
        return new Builder();
    }

}
