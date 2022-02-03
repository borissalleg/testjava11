package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "Productos")
@JsonInclude(JsonInclude.Include.ALWAYS)
public class productModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    int idProducto;

    @Column(name = "nombre_producto", nullable = false, length = 50)
    String nombreProducto;

    @Column(name = "descripcion_producto", nullable = false, length = 250)
    String descripcionProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_catproducto", nullable = false, updatable = false)
    categoryModel categoriaProducto;

    public productModel() {
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return this.descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public categoryModel getCategoriaProducto() {
        return this.categoriaProducto;
    }

    public void setCategoriaProducto(categoryModel categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

}
