package com.lucero.demoCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucero.demoCrud.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}