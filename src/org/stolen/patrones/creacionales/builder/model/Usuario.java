package org.stolen.patrones.creacionales.builder.model;

public class Usuario {

    private String nombre;
    private int edad;
    private String ciudad;
    private String profesion;

    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.ciudad = builder.ciudad;
        this.profesion = builder.profesion;
    }

    public void mostrar() {
        System.out.println(nombre + " - " + edad + " - " + ciudad + " - " + profesion);
    }

    public static class Builder {
        private String nombre;
        private int edad;
        private String ciudad;
        private String profesion;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public Builder profesion(String profesion) {
            this.profesion = profesion;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
