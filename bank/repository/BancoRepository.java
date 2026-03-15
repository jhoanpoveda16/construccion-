package com.bank.repository;

import com.bank.domain.model.*;
import java.util.*;

public class BancoRepository {

    public static Map<String, Usuario> usuarios = new HashMap<>();

    public static Map<String, Cliente> clientes = new HashMap<>();

    public static Map<String, CuentaBancaria> cuentas = new HashMap<>();

    public static Map<String, Prestamo> prestamos = new HashMap<>();

    public static Map<String, Transferencia> transferencias = new HashMap<>();

    public static List<BitacoraOperacion> bitacora = new ArrayList<>();

}