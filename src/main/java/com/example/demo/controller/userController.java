package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.userModel;
import com.example.demo.repository.userRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/user")
public class userController {

    @Autowired
    private userRepository usuario;

    @GetMapping(value = "/list")
    public List<userModel> listarUsuarios() {

        System.out.println("Consulta a todos los usuarios ");
        return usuario.findAll();

    }

    @GetMapping(value = "/save")
    // public void saveUser(@RequestParam String param) {
    public void saveUser() {
        System.out.println("Registro ingresado correctamente");
    }

    // private List<userModel> fuenteDatos(){

    // List<userModel> usuario = new ArrayList<userModel>() ;
    // userModel usuario1= new userModel(1, "boris@gmail.com", "3334423");
    // userModel usuario2= new userModel(1, "JUAN@gmail.com", "3334423");
    // userModel usuario3= new userModel(1, "MARIA@gmail.com", "3334423");
    // usuario.add(usuario1);
    // usuario.add(usuario2);
    // usuario.add(usuario3);
    // return usuario;

    // }

}
