package com.bank.domain.model;

import com.bank.domain.model.enums.*;

public class Usuario extends Persona {

    private String username;
    private String password;
    private RolSistema rol;
    private EstadoUsuario estado;

    public Usuario(String id, String nombre, String documento,
                   String telefono, String email, String direccion,
                   String username, String password, RolSistema rol) {

        super(id, nombre, documento, telefono, email, direccion);

        this.username = username;
        this.password = password;
        this.rol = rol;
        this.estado = EstadoUsuario.ACTIVO;
    }

    public RolSistema getRol() {
        return rol;
    }

}