package org.stolen.patrones.estructurales.proxy.proxy.archivo;

import org.stolen.patrones.estructurales.proxy.impl.archivo.Archivo;
import org.stolen.patrones.estructurales.proxy.impl.archivo.ArchivoReal;

public class ArchivoProxy implements Archivo {

    private ArchivoReal archivoReal;
    private String usuario;
    private String nombreArchivo;

    public ArchivoProxy(String usuario, String nombreArchivo) {
        this.usuario = usuario;
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void leer() {
        if ("admin".equals(usuario)) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo);
            }
            archivoReal.leer();
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
