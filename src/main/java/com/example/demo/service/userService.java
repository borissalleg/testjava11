package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.model.userModel;
import com.example.demo.repository.userRepository;

@Service
@Repository
public class userService {
    @Autowired
    public userRepository usuarios;

    public List<userModel> listarUsuarios() {
        return usuarios.findAll();

    }

}
