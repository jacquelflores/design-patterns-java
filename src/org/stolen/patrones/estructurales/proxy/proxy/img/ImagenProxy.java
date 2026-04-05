package org.stolen.patrones.estructurales.proxy.proxy.img;

import org.stolen.patrones.estructurales.proxy.impl.img.Imagen;
import org.stolen.patrones.estructurales.proxy.impl.img.ImagenReal;

public class ImagenProxy implements Imagen {

    private ImagenReal imagenReal;
    private String nombre;
    private boolean isPremium;

    public ImagenProxy(String nombre, boolean isPremium) {
        this.nombre = nombre;
        this.isPremium = isPremium;
    }

    @Override
    public void mostrar() {
        if (isPremium) {
            if (imagenReal == null) {
                imagenReal = new ImagenReal(nombre);
            }
            imagenReal.mostrar();
        } else {
            System.out.println("Necesitas suscripción");
        }
    }
}
