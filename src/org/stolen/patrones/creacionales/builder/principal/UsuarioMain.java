package org.stolen.patrones.creacionales.builder.principal;

import org.stolen.patrones.creacionales.builder.model.Usuario;

public class UsuarioMain {
    public static void main(String[] args) {

       Usuario user = Usuario.builder()
                .nombre("Jacqueline")
                .edad(23)
                .ciudad("Lima")
                .profesion("Backend Java")
                .build();

        user.mostrar();
    }
}
