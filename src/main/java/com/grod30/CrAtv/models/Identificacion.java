package com.grod30.CrAtv.models;

import type.IdentificacionType;

public class Identificacion {
    private IdentificacionType tipo;
    private String numero;

    public Identificacion(IdentificacionType tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public IdentificacionType getTipo() {
        return tipo;
    }

    public void setTipo(IdentificacionType tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
