package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_proveedores")
public class proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idProveedor;

    @Column(name = "nombre_contacto", nullable = false, length = 100)
    String nombreContacto;

    @Column(name = "nombre_empresa", nullable = false, length = 100)
    String empresa;

    @Column(nullable = false, length = 100)
    String direccion;

    @Column(nullable = false, length = 25)
    String telefono;

}
