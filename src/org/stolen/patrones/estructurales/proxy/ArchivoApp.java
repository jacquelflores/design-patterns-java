package org.stolen.patrones.estructurales.proxy;

import org.stolen.patrones.estructurales.proxy.impl.archivo.Archivo;
import org.stolen.patrones.estructurales.proxy.proxy.archivo.ArchivoProxy;

public class ArchivoApp {
    public static void main(String[] args) {

        Archivo archivo1 = new ArchivoProxy("admin", "documento.txt");
        archivo1.leer(); // permitido

        Archivo archivo2 = new ArchivoProxy("user", "documento.txt");
        archivo2.leer(); // denegado

    }
}
