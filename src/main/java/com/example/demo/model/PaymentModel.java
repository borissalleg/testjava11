package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_formas_pagos")
public class PaymentModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_pago")
    int idFormasPago;

    @Column(name = "nombre_forma_pago", nullable = false, length = 30)
    String nombreFormasPago;

    @OneToOne(mappedBy = "formaDePago")
    private ShoppingModel idCompra;

    public PaymentModel() {
    }

    public int getIdFormasPago() {
        return this.idFormasPago;
    }

    public void setIdFormasPago(int idFormasPago) {
        this.idFormasPago = idFormasPago;
    }

    public String getNombreFormasPago() {
        return this.nombreFormasPago;
    }

    public void setNombreFormasPago(String nombreFormasPago) {
        this.nombreFormasPago = nombreFormasPago;
    }

}