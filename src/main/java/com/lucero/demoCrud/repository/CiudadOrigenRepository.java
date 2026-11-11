package com.lucero.demoCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucero.demoCrud.models.CiudadOrigen;

public interface CiudadOrigenRepository extends JpaRepository<CiudadOrigen, Long> {
}