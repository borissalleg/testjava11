package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_compras")
public class ShoppingModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    int idCompra;
    @Column(name = "estado_compra", nullable = false)
    boolean estado;

    @OneToOne
    @JoinColumn(name = "fk_formas_pago", referencedColumnName = "id_forma_pago")
    PaymentModel formaDePago;

    @OneToOne(mappedBy = "id_compras")
    private InvoiceModel id_factura;

    public ShoppingModel() {
    }

    public int getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public PaymentModel getFormaDePago() {
        return this.formaDePago;
    }

    public void setFormaDePago(PaymentModel formaDePago) {
        this.formaDePago = formaDePago;
    }

    public InvoiceModel getId_factura() {
        return this.id_factura;
    }

    public void setId_factura(InvoiceModel id_factura) {
        this.id_factura = id_factura;
    }

}
