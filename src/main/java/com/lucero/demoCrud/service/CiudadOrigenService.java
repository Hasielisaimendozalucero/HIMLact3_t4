package com.lucero.demoCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucero.demoCrud.models.CiudadOrigen;
import com.lucero.demoCrud.repository.CiudadOrigenRepository;
import java.util.List;

@Service
public class CiudadOrigenService {

    @Autowired
    private CiudadOrigenRepository repo;

    public List<CiudadOrigen> listarTodas() {
        return repo.findAll();
    }
}