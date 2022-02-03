package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.productModel;
import com.example.demo.repository.productRepository;

@RestController
@RequestMapping(value = "/productos")
public class productController {
    @Autowired
    productRepository productos;

    @GetMapping(value = "/listar")
    public List<productModel> listarProductos() {
        System.out.println("Listando productos");
        return productos.findAll();
    }

    @PostMapping(value = "/guardar")
    public void saveUser(@RequestBody productModel product) {

        productos.save(product);
    }
}
