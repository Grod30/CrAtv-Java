package com.grod30.CrAtv.models;

public class Telefono {
    private int codigoPais;
    private int numTelefono;

    public Telefono(int codigoPais, int numTelefono) {
        this.codigoPais = codigoPais;
        this.numTelefono = numTelefono;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
}
