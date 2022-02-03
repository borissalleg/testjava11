package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.userTypeModel;
import com.example.demo.repository.userTypeRepository;

@Service
@Repository
public class usetTypeService {
    @Autowired
    public userTypeRepository typeUser;

    public List<userTypeModel> listarTipoUsuarios() {
        return typeUser.findAll();

    }
}
