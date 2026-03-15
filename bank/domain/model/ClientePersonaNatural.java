package com.bank.domain.model;

import java.time.LocalDate;

public class ClientePersonaNatural extends Cliente {

    private LocalDate fechaNacimiento;

    public ClientePersonaNatural(String clienteId, String id, String nombre,
                                 String documento, String telefono,
                                 String email, String direccion,
                                 LocalDate fechaNacimiento) {

        super(clienteId, id, nombre, documento, telefono, email, direccion);
        this.fechaNacimiento = fechaNacimiento;
    }

}