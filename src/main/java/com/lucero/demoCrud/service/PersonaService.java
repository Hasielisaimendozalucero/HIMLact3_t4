package com.lucero.demoCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucero.demoCrud.models.Persona;
import com.lucero.demoCrud.repository.PersonaRepository;
import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepo;

    public List<Persona> listarTodas() {
        return personaRepo.findAll();
    }

    public Persona guardar(Persona persona) {
        return personaRepo.save(persona);
    }

    public Persona obtenerPorId(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        personaRepo.deleteById(id);
    }
}