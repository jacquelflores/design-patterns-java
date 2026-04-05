package org.stolen.patrones.creacionales.prototype.model;

import org.stolen.patrones.creacionales.prototype.interfaces.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Personaje implements Prototype<Personaje> {

    private int vida;
    private int ataque;
    private List<String> inventario;
    private List<String> habilidades;

    public Personaje(int vida, int ataque, List<String> inventario, List<String> habilidades) {
        this.vida = vida;
        this.ataque = ataque;
        this.inventario = inventario;
        this.habilidades = habilidades;
    }

    private Personaje(Personaje original) {
        this.vida = original.vida;
        this.ataque = original.ataque;

        this.inventario = new ArrayList<>(original.inventario);
        this.habilidades = new ArrayList<>(original.habilidades);
    }

    @Override
    public Personaje clonar() {
        return new Personaje(this);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void mostrar() {
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Inventario: " + inventario);
        System.out.println("Habilidades: " + habilidades);
        System.out.println("----------------------");
    }
}
