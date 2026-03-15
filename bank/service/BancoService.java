package com.bank.service;

import com.bank.domain.model.*;
import com.bank.repository.BancoRepository;

public class BancoService {

    public void crearCuenta(CuentaBancaria cuenta){

        BancoRepository.cuentas.put(cuenta.getNumeroCuenta(), cuenta);

    }

    public void depositar(String numeroCuenta,double monto){

        CuentaBancaria cuenta = BancoRepository.cuentas.get(numeroCuenta);

        if(cuenta!=null){

            cuenta.depositar(monto);

            System.out.println("Deposito realizado");

        }

    }

    public void retirar(String numeroCuenta,double monto){

        CuentaBancaria cuenta = BancoRepository.cuentas.get(numeroCuenta);

        if(cuenta!=null){

            cuenta.retirar(monto);

            System.out.println("Retiro realizado");

        }

    }

    public void transferir(String origen,String destino,double monto){

        CuentaBancaria c1 = BancoRepository.cuentas.get(origen);
        CuentaBancaria c2 = BancoRepository.cuentas.get(destino);

        if(c1!=null && c2!=null){

            if(c1.getSaldo()>=monto){

                c1.retirar(monto);
                c2.depositar(monto);

                System.out.println("Transferencia exitosa");

            }else{

                System.out.println("Fondos insuficientes");

            }

        }

    }

}