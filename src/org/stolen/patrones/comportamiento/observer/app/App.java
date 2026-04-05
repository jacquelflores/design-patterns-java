package org.stolen.patrones.comportamiento.observer.app;


import org.stolen.patrones.comportamiento.observer.model.PesoARGObservador;
import org.stolen.patrones.comportamiento.observer.model.PesoMXObservador;
import org.stolen.patrones.comportamiento.observer.model.SolObservador;
import org.stolen.patrones.comportamiento.observer.model.Subject;

public class App {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new SolObservador(subject);
        new PesoARGObservador(subject);
        new PesoMXObservador(subject);

        System.out.println("Si desea cambiar 10 dolares obtendra : ");
        subject.setEstado(10);
        System.out.println("-----------------");
        System.out.println("Si desea cambiar 100 dolares obtendra : ");
        subject.setEstado(100);
    }
}
