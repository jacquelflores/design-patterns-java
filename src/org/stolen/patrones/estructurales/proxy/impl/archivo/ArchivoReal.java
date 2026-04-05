package org.stolen.patrones.estructurales.proxy.impl.archivo;

public class ArchivoReal implements Archivo {

    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo el archivo Real..." + nombre);
    }
}
