package com.lucero.demoCrud.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ciudad_origen")
public class CiudadOrigen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String estado;

    // Relación: Una ciudad puede tener muchas personas
    @OneToMany(mappedBy = "ciudadOrigen", cascade = CascadeType.ALL)
    private List<Persona> personas;

    public CiudadOrigen() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public List<Persona> getPersonas() { return personas; }
    public void setPersonas(List<Persona> personas) { this.personas = personas; }
}