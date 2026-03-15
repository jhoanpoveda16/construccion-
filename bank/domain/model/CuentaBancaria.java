package com.bank.domain.model;

import com.bank.domain.model.enums.*;
import java.time.LocalDate;

public class CuentaBancaria {

    private String numeroCuenta;
    private TipoCuenta tipoCuenta;
    private double saldo;
    private Moneda moneda;
    private EstadoCuenta estado;
    private LocalDate fechaApertura;
    private Cliente cliente;

    public CuentaBancaria(String numeroCuenta, TipoCuenta tipoCuenta,
                          Moneda moneda, Cliente cliente) {

        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.moneda = moneda;
        this.cliente = cliente;

        this.saldo = 0;
        this.estado = EstadoCuenta.ACTIVA;
        this.fechaApertura = LocalDate.now();
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {

        if (saldo >= monto) {
            saldo -= monto;
        }
    }

    public double getSaldo() {
        return saldo;
    }

}