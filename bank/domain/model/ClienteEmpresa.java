package com.bank.domain.model;

public class ClienteEmpresa extends Cliente {

    private String razonSocial;
    private String nit;
    private ClientePersonaNatural representanteLegal;

    public ClienteEmpresa(String clienteId, String id, String nombre,
                          String documento, String telefono,
                          String email, String direccion,
                          String razonSocial, String nit,
                          ClientePersonaNatural representanteLegal) {

        super(clienteId, id, nombre, documento, telefono, email, direccion);

        this.razonSocial = razonSocial;
        this.nit = nit;
        this.representanteLegal = representanteLegal;
    }

}