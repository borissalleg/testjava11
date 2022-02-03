package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.productModel;
import com.example.demo.repository.productRepository;

@Service
@Repository
public class productService {
    @Autowired
    private productRepository productos;

    public List<productModel> listarProductos() {
        return productos.findAll();
    }
}
