package com.example.Registros.controlador;

import org.springframework.ui.Model;
import com.example.Registros.entidad.Persona;
import com.example.Registros.servicio.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class Controlador {
    @Autowired
    private PersonaServicio servicio;

    public Controlador(PersonaServicio servicio) {
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona> personas = servicio.ListarTodasLasPersonas();
        model.addAttribute("personas",personas);
        return "index";
    }
}
