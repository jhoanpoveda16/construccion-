package com.bank.domain.model;

import com.bank.domain.model.enums.*;
import java.time.LocalDateTime;

public class Transferencia {

    private String id;
    private CuentaBancaria origen;
    private CuentaBancaria destino;
    private double monto;
    private EstadoTransferencia estado;
    private LocalDateTime fecha;

    public Transferencia(String id, CuentaBancaria origen,
                         CuentaBancaria destino, double monto) {

        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;

        this.estado = EstadoTransferencia.PENDIENTE;
        this.fecha = LocalDateTime.now();
    }

    public void ejecutar() {

        if (origen.getSaldo() >= monto) {

            origen.retirar(monto);
            destino.depositar(monto);

            estado = EstadoTransferencia.EJECUTADA;
        }

    }

}