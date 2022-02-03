package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
// import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "tbl_facturas")
public class InvoiceModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_factura;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_compra", referencedColumnName = "id_compra")
    ShoppingModel id_compras;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_producto", referencedColumnName = "id_producto", nullable = false, updatable = false)
    productModel id_productos;

    public InvoiceModel() {
    }

    public int getId_factura() {
        return this.id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public ShoppingModel getId_compras() {
        return this.id_compras;
    }

    public void setId_compras(ShoppingModel id_compras) {
        this.id_compras = id_compras;
    }

}
