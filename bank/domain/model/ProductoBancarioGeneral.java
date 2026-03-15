package com.bank.domain.model;

public class ProductoBancarioGeneral {

    private String id;
    private String nombreProducto;
    private boolean requiereAprobacion;

    public ProductoBancarioGeneral(String id,
                                   String nombreProducto,
                                   boolean requiereAprobacion) {

        this.id = id;
        this.nombreProducto = nombreProducto;
        this.requiereAprobacion = requiereAprobacion;
    }

}