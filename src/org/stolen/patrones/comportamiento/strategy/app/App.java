package org.stolen.patrones.comportamiento.strategy.app;


import org.stolen.patrones.comportamiento.strategy.model.AntivirusSimple;
import org.stolen.patrones.comportamiento.strategy.model.Contexto;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusSimple());
		contexto.ejecutar();
	}

}
