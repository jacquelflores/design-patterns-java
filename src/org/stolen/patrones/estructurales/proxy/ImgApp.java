package org.stolen.patrones.estructurales.proxy;

import org.stolen.patrones.estructurales.proxy.impl.img.Imagen;
import org.stolen.patrones.estructurales.proxy.proxy.img.ImagenProxy;

public class ImgApp {
    public static void main(String[] args) {

        Imagen imagen = new ImagenProxy("Spiderman",true);
        imagen.mostrar();
        imagen.mostrar();
        imagen.mostrar();

    }
}
