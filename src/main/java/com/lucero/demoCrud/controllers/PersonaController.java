package com.lucero.demoCrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.lucero.demoCrud.models.Persona;
import com.lucero.demoCrud.service.PersonaService;
import com.lucero.demoCrud.service.CiudadOrigenService;

@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private CiudadOrigenService ciudadOrigenService;

    // LISTAR
    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("personas", personaService.listarTodas());
        return "index";
    }

    // FORMULARIO NUEVO
    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("persona", new Persona());
        model.addAttribute("ciudades", ciudadOrigenService.listarTodas());
        return "form";
    }

    // GUARDAR
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Persona persona) {
        personaService.guardar(persona);
        return "redirect:/";
    }

    // FORMULARIO EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("persona", personaService.obtenerPorId(id));
        model.addAttribute("ciudades", ciudadOrigenService.listarTodas());
        return "form";
    }

    // ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        personaService.eliminar(id);
        return "redirect:/";
    }
}