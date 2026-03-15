package com.bank.domain.model;

public abstract class Persona {

    protected String id;
    protected String nombre;
    protected String documento;
    protected String telefono;
    protected String email;
    protected String direccion;

    public Persona(String id, String nombre, String documento,
                   String telefono, String email, String direccion) {

        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

}