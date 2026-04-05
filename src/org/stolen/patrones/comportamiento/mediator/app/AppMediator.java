package org.stolen.patrones.comportamiento.mediator.app;

import org.stolen.patrones.comportamiento.mediator.model.CheckEmpresa;
import org.stolen.patrones.comportamiento.mediator.model.CheckPersona;
import org.stolen.patrones.comportamiento.mediator.model.Formulario;

public class AppMediator {
    public static void main(String[] args) {
        Formulario f = new Formulario();

        CheckEmpresa empresa = new CheckEmpresa(f);
        CheckPersona persona = new CheckPersona(f);

        empresa.seleccionar();
        persona.seleccionar();
    }
}
