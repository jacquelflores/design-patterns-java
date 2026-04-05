package org.stolen.patrones.estructurales.proxy.impl.img;

public class ImagenReal implements Imagen{

    private String nombre;

    public ImagenReal(String nombre){
        this.nombre = nombre;
        System.out.println("Cargando imagen: " + nombre);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando imagen: " + nombre);
    }
}
