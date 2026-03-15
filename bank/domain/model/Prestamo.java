package com.bank.domain.model;

import com.bank.domain.model.enums.*;

public class Prestamo {

    private String id;
    private double montoSolicitado;
    private double montoAprobado;
    private double tasaInteres;
    private int plazoMeses;
    private EstadoPrestamo estado;

    private CuentaBancaria cuentaDestino;

    public Prestamo(String id, double montoSolicitado,
                    int plazoMeses, CuentaBancaria cuentaDestino) {

        this.id = id;
        this.montoSolicitado = montoSolicitado;
        this.plazoMeses = plazoMeses;
        this.cuentaDestino = cuentaDestino;
        this.estado = EstadoPrestamo.EN_ESTUDIO;
    }

    public void aprobar(double monto) {

        this.montoAprobado = monto;
        this.estado = EstadoPrestamo.APROBADO;

    }

}