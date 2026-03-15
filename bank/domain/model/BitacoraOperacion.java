package com.bank.domain.model;

import java.time.LocalDateTime;
import java.util.Map;

public class BitacoraOperacion {

    private String id;
    private String tipoOperacion;
    private LocalDateTime fechaHora;
    private String usuarioId;
    private String rolUsuario;
    private String productoAfectado;

    private Map<String,Object> datosDetalle;

    public BitacoraOperacion(String id,
                             String tipoOperacion,
                             String usuarioId,
                             String rolUsuario,
                             String productoAfectado,
                             Map<String,Object> datosDetalle) {

        this.id = id;
        this.tipoOperacion = tipoOperacion;
        this.usuarioId = usuarioId;
        this.rolUsuario = rolUsuario;
        this.productoAfectado = productoAfectado;
        this.datosDetalle = datosDetalle;

        this.fechaHora = LocalDateTime.now();
    }

}