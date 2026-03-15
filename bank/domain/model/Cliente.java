package com.bank.domain.model;

public abstract class Cliente extends Persona {

    protected String clienteId;

    public Cliente(String clienteId, String id, String nombre,
                   String documento, String telefono,
                   String email, String direccion) {

        super(id, nombre, documento, telefono, email, direccion);
        this.clienteId = clienteId;
    }

}