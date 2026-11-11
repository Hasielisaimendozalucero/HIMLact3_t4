package com.lucero.demoCrud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    // Relación: Muchas personas pertenecen a una CiudadOrigen (Llave foránea)
    @ManyToOne
    @JoinColumn(name = "ciudad_origen_id")
    private CiudadOrigen ciudadOrigen;

    public Persona() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public CiudadOrigen getCiudadOrigen() { return ciudadOrigen; }
    public void setCiudadOrigen(CiudadOrigen ciudadOrigen) { this.ciudadOrigen = ciudadOrigen; }
}