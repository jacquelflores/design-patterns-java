package org.stolen.patrones.creacionales.singleton.model;

public class Configuracion {
    private static Configuracion configuracion;
    private String idioma;
    private boolean modoOscuro;

    private Configuracion() {
        this.idioma = "ES";
        this.modoOscuro = false;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }

    public static synchronized Configuracion getInstance() {
        if (configuracion == null) {
            configuracion = new Configuracion();
        }
        return configuracion;
    }
}
