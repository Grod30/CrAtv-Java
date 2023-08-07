package com.grod30.CrAtv.models;

import type.IdentificacionType;

public class Emisor {
    private String nombre;
    private Identificacion identificacion;
    private String nombreComercial;
    private Ubicacion ubicacion;
    private Telefono telefono;
    private String correoElectronico;

    public Emisor(String nombre, Identificacion identificacion, String nombreComercial, Ubicacion ubicacion, Telefono telefono, String correoElectronico) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nombreComercial = nombreComercial;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Identificacion identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
