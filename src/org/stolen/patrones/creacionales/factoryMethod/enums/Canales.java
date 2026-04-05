package org.stolen.patrones.creacionales.factoryMethod.enums;

public enum Canales {
    EMAIL("email"),
    PUSH("push"),
    SMS("sms"),
    WTSP("whatsApp");
    private String name;

    Canales(String name) {
        this.name = name;
    }
}
