package org.stolen.patrones.creacionales.singleton.app;

import org.stolen.patrones.creacionales.singleton.model.Configuracion;

public class AppSingleton {
    public static void main(String[] args) {

        Configuracion config = Configuracion.getInstance();
        config.setIdioma("EN");
        config.setModoOscuro(true);

        Configuracion config_02 = Configuracion.getInstance();
        System.out.println(config_02.getIdioma());
        System.out.println(config_02.isModoOscuro());
    }
}
